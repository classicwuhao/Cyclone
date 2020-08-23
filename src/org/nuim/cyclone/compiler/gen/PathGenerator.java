package org.nuim.cyclone.compiler.gen;
import org.nuim.cyclone.compiler.graph.StateMatrix;
import org.nuim.cyclone.compiler.GenerationException;
import org.nuim.cyclone.model.State;
import org.nuim.cyclone.model.Goal;
import org.nuim.cyclone.model.ForExpr;
import org.nuim.cyclone.model.StopExpr;
import org.nuim.cyclone.model.ViaExpr;
import org.nuim.cyclone.model.StateInclusion;
import org.nuim.cyclone.model.TransInclusion;
import org.nuim.cyclone.model.PathExpr;
import uran.formula.*;
import uran.formula.type.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class PathGenerator {
    private StateMatrix matrix;
    private List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
    private FunctionFactory factory = new FunctionFactory(1024,0.75f);
    private final String TRACE_STR="T";
    List<AbstractFormula> path = new ArrayList<AbstractFormula>();
    private int steps;

    public PathGenerator(StateMatrix matrix, int steps){
        this.matrix = matrix;
        this.steps = steps;
    }

    public PathGenerator(StateMatrix matrix){
        this.matrix = matrix;
        Goal goal = this.matrix.machine().getGoal();
        this.steps = goal.ForExpr().steps();
    }

    public void gen() throws GenerationException{
        gen(steps);
    }

    public void gen_with_finals() throws GenerationException{
        gen(steps);
        AbstractFormula final_formula = gen_finals();
        AbstractFormula stop_formula = gen_stops();

        if (final_formula!=null && stop_formula!=null){
            formulas.add(FormulaBuilder.some(final_formula,stop_formula));
        }else if (final_formula!=null && stop_formula==null){
            formulas.add(final_formula);
        }else if (final_formula==null && stop_formula!=null){
            formulas.add(stop_formula);
        }
        else{
            //Error: no final/stop state has been specified.
            throw new GenerationException(" No final/stop state(s) are being specified.");
        }

        /* generate constraints for via expression. */ 
        if (this.matrix.machine().hasGoal()){
            Goal goal = this.matrix.machine().getGoal();
            if (goal.hasViaExpr()) gen_via_expr(goal.ViaExpr());
        }
    }   

    /* Generate path constraints 
     * Use a queue to keep track of visited states
     * 
     * */ 
    private void gen(int k) throws GenerationException{
        Queue<Integer> queue = new LinkedList<Integer>();
        List<AbstractFormula> des_formulas = new ArrayList<AbstractFormula>();
        trace_gen(k+1);

        /* push start state to the queue 1st */
        queue.add(0);
        for (int i=0;i<k;i++){
            Constant t_i = factory.conLookup(TRACE_STR + i);
            Constant t_j = factory.conLookup(TRACE_STR + (i+1));
            int size = queue.size();
            des_formulas.clear();
            for (int j=0;j<size;j++){
                int src = queue.poll();
                AbstractFormula formula1 = new EqFormula(t_i,new NumLiteral(src));
                List<Integer> nodes = this.matrix.next(src);
                nodes.remove(0);
                for (int l=0;l<nodes.size();l++){
                    if (!queue.contains(nodes.get(l))) queue.add(nodes.get(l));
                    des_formulas.add(
                        new AndFormula(formula1, new EqFormula(t_j, new NumLiteral(nodes.get(l))))
                    );
                }
            }

            if (des_formulas.size()>=2){
                path.add(FormulaBuilder.some(des_formulas.toArray(new AbstractFormula[des_formulas.size()])));
            }
            else if (des_formulas.size()==1){
                path.add(des_formulas.get(0));
            }
            else
                throw new GenerationException(" no further states can be progressed, the formulas are UNSAT.");
        }

        if (path.size()>=2)
            formulas.add(FormulaBuilder.all (path.toArray(new AbstractFormula[path.size()])));
        else if (path.size()==1)
            formulas.add(path.get(0));
    }

    private void trace_gen(int k){
        for (int i=0;i<k;i++){
            Constant v = factory.createConstant(TRACE_STR+i,new Int());
            formulas.add(FormulaBuilder.range(0, this.matrix.size()-1, v, true));
        }
    }

    /* generate constraints for the set of final states. */ 
    private AbstractFormula gen_finals(){
        List<Integer> finals = this.matrix.finals();
        Constant f = factory.conLookup(TRACE_STR+steps);
        AbstractFormula formula;

        if (finals.size()==0) return null;
        formula = new EqFormula(f,new NumLiteral(finals.get(0)));
        
        for (int i=1;i<finals.size();i++){
            formula = new OrFormula(
                formula, new EqFormula(f, new NumLiteral(finals.get(i)))
            );
        }

        return formula;
    }

    private AbstractFormula gen_stops(){
        AbstractFormula formula;
        Constant f = factory.conLookup(TRACE_STR+steps);
        Goal goal = this.matrix.machine().getGoal();
        if (!goal.hasStop()) return null;

        StopExpr stopexpr = goal.StopExpr();
        State s = stopexpr.states().get(0);
        formula = new EqFormula(f, new NumLiteral(s.uid()));
        List<State> states = stopexpr.states();
        for (int i=1;i<states.size();i++){
            formula = new OrFormula(formula, new EqFormula(f, new NumLiteral(states.get(i).uid())));
        }
        return formula;
    }

    private void gen_via_expr(ViaExpr viaexpr){
        for (PathExpr expr : viaexpr.exprs()){
            if (expr.isStateInclusion()){
                formulas.add(gen_state_inclusion((StateInclusion)expr));
            }else if (expr.isTransInclusion()){
                formulas.add(gen_trans_inclusion((TransInclusion)expr));
            }
        }
    }
    
    /*
     * IMPORTANT: we have to go through this.steps+1 since 1 step involves two states. 
     * */ 
    private AbstractFormula gen_state_inclusion(StateInclusion si_expr){
        State state = si_expr.state();    
        List<AbstractFormula> si_formulas = new ArrayList<AbstractFormula>();
        for (int i=0;i<this.steps+1;i++){
            Constant f = factory.conLookup(TRACE_STR+i);
            si_formulas.add(new EqFormula(f, new NumLiteral(state.uid())));
        }

        return si_formulas.size()>=2 ? 
                FormulaBuilder.some(si_formulas.toArray(new AbstractFormula[si_formulas.size()])) 
                : 
                si_formulas.get(0);
    }


    private AbstractFormula gen_trans_inclusion(TransInclusion ti_expr){
        List<State> path = ti_expr.Path();
        List<AbstractFormula> ti_formulas = new ArrayList<AbstractFormula>();
        
        for (int i=0;i<=this.steps+1-path.size();i++){
            Constant c = factory.conLookup(TRACE_STR+i);
            State s = path.get(0);
            AbstractFormula formula = new EqFormula(c, new NumLiteral(s.uid()));
            for (int j=1;j<path.size();j++){
                Constant f = factory.conLookup(TRACE_STR+(j+i));
                AbstractFormula sub_formula = new EqFormula(f, new NumLiteral(path.get(j).uid()));
                formula = new AndFormula(formula, sub_formula);
            }
            ti_formulas.add(formula);
        }

        return ti_formulas.size()>=2 ? 
                FormulaBuilder.some(ti_formulas.toArray(new AbstractFormula[ti_formulas.size()]))
                :
                ti_formulas.get(0);
    }

    public List<Function> trace(){
        return factory.getAllFunctions();
    }

    public int size(){
        return path.size();
    }

    public List<AbstractFormula> constraints(){      
        return formulas;
    }

    public FunctionFactory factory(){
        return this.factory;
    }

    public StateMatrix matrix(){return this.matrix;}

}