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
import org.nuim.cyclone.model.SpecialState;
import org.nuim.cyclone.compiler.GenerationContext;
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
    private int formula_size;
    private GenerationContext gen_context; 

    public PathGenerator(StateMatrix matrix, int steps){
        this.matrix = matrix;
        this.steps = steps;
        this.gen_context = matrix.context();
    }

    public PathGenerator(StateMatrix matrix){
        this.matrix = matrix;
        Goal goal = this.matrix.machine().getGoal();
        this.steps = goal.ForExpr().steps();
        this.gen_context = matrix.context();
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
                this.incFormulaSize();
                List<Integer> nodes = this.matrix.next(src);
                nodes.remove(0);
                for (int l=0;l<nodes.size();l++){
                    //System.out.println(nodes.get(l));
                    if (!queue.contains(nodes.get(l))) queue.add(nodes.get(l));
                    des_formulas.add(
                        new AndFormula(formula1, new EqFormula(t_j, new NumLiteral(nodes.get(l))))
                    );
                    this.incFormulaSize();
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
            this.incFormulaSize();
        }
    }

    /* generate constraints for the set of final states. */ 
    private AbstractFormula gen_finals(){
        List<Integer> finals = this.matrix.finals();
        Constant f = factory.conLookup(TRACE_STR+steps);
        AbstractFormula formula;

        if (finals.size()==0) return null;
        formula = new EqFormula(f,new NumLiteral(finals.get(0)));
        this.incFormulaSize();

        for (int i=1;i<finals.size();i++){
            formula = new OrFormula(
                formula, new EqFormula(f, new NumLiteral(finals.get(i)))
            );
            this.incFormulaSize();
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
        this.incFormulaSize();
        List<State> states = stopexpr.states();

        for (int i=1;i<states.size();i++){
            formula = new OrFormula(formula, new EqFormula(f, new NumLiteral(states.get(i).uid())));
            this.incFormulaSize();
        }
        return formula;
    }

    private void gen_via_expr(ViaExpr viaexpr){
        for (PathExpr expr : viaexpr.exprs()){
            if (expr.isStateInclusion()){
                formulas.add(gen_state_inclusion((StateInclusion)expr));
            }else if (expr.isTransInclusion()){
                AbstractFormula formula = gen_trans_inclusion((TransInclusion)expr);
                if (formula!=null) formulas.add(formula);
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
            this.incFormulaSize();
        }

        return si_formulas.size()>=2 ? 
                FormulaBuilder.some(si_formulas.toArray(new AbstractFormula[si_formulas.size()])) 
                : 
                si_formulas.get(0);
    }

    private AbstractFormula gen_trans_inclusion(TransInclusion ti_expr){
        List<State> path = ti_expr.Path();
        List<AbstractFormula> ti_formulas = new ArrayList<AbstractFormula>();
        int path_length = this.steps+1-path.size();

        if (path_length<0) {
            /* issue warnning: cannot generate path because the length is greater than the specified length. */ 
            this.gen_context.logWarnings(ti_expr.info(),"path cannot be generated beacuse path length is greater than the specified steps");
            return null;
        }
        
        for (int i=0;i<=this.steps+1-path.size();i++){
            Constant c = factory.conLookup(TRACE_STR+i);
            State s = path.get(0);
            if (s.isSpecial()){
                SpecialState ss = (SpecialState)s;
                if (ss.isOne()) continue;
            }
            AbstractFormula formula = new EqFormula(c, new NumLiteral(s.uid()));
            this.incFormulaSize();
            for (int j=1;j<path.size();j++){
                s = path.get(j);
                if (s.isSpecial()){
                    SpecialState ss = (SpecialState)s;
                    if (ss.isOne()) continue;
                }
                Constant f = factory.conLookup(TRACE_STR+(j+i));
                AbstractFormula sub_formula = new EqFormula(f, new NumLiteral(path.get(j).uid()));
                formula = new AndFormula(formula, sub_formula);
                this.incFormulaSize();
            }
            ti_formulas.add(formula);
        }

        /* no need for generating extra formulas */ 
        if (ti_formulas.size()==0) return null;

        return ti_formulas.size()>=2 ? 
                FormulaBuilder.some(ti_formulas.toArray(new AbstractFormula[ti_formulas.size()]))
                :
                ti_formulas.get(0);
    }

    private void incFormulaSize(){
        this.formula_size++;
    }

    public int formula_size(){
        return this.formula_size;
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