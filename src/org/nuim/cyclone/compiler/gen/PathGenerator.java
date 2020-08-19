package org.nuim.cyclone.compiler.gen;
import org.nuim.cyclone.compiler.graph.StateMatrix;
import org.nuim.cyclone.compiler.GenerationException;
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
    }

    public void gen() throws GenerationException{
        gen(steps);
    }

    public void gen_with_finals() throws GenerationException{
        gen(steps);
        gen_finals();
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
            des_formulas.clear();
            Constant t_i = factory.conLookup(TRACE_STR + i);
            Constant t_j = factory.conLookup(TRACE_STR + (i+1));
            int size = queue.size();
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

    }

    private void trace_gen(int k){
        for (int i=0;i<k;i++){
            Constant v = factory.createConstant(TRACE_STR+i,new Int());
            formulas.add(FormulaBuilder.range(0, this.matrix.size()-1, v, true));
        }
    }

    /* generate constraints for the set of final states. */ 
    private void gen_finals(){
        List<Integer> finals = this.matrix.finals();
        Constant f = factory.conLookup(TRACE_STR+steps);
        AbstractFormula formula;

        if (finals.size()==0) return;
        formula = new EqFormula(f,new NumLiteral(finals.get(0)));
        
        for (int i=1;i<finals.size();i++){
            formula = new OrFormula(
                formula, new EqFormula(f, new NumLiteral(finals.get(i)))
            );
        }

        formulas.add(formula);
    }

    public List<Function> trace(){
        return factory.getAllFunctions();
    }

    public int size(){
        return path.size();
    }

    public List<AbstractFormula> constraints(){
        if (path.size()>=2)
            formulas.add(FormulaBuilder.all (path.toArray(new AbstractFormula[path.size()])));
        else if (path.size()==1)
            formulas.add(path.get(0));
        
        return formulas;
    }

    public FunctionFactory factory(){
        return this.factory;
    }

    public StateMatrix matrix(){return this.matrix;}

}