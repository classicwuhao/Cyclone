package org.nuim.cyclone.compiler.gen;
import org.nuim.cyclone.compiler.graph.StateMatrix;
import uran.formula.*;
import uran.formula.type.*;
import uran.formula.smt2.SMT2Writer;
import uran.solver.*;
import java.util.List;
import java.util.ArrayList;

public class PathGenerator {
    private StateMatrix matrix;
    private List<AbstractFormula> formulas;
    private FunctionFactory factory = new FunctionFactory(1024,0.75f);

    public PathGenerator(StateMatrix matrix){
        this.matrix = matrix;
        formulas = new ArrayList<AbstractFormula>();
    }

    public void gen(int k){
        for (int i=0;i<k;i++){
            Constant v = factory.createConstant("T"+i,new Int());
            formulas.add(FormulaBuilder.range(0, this.matrix.size()-1, v, true));
        }

        for (int i=0;i>k-1;i++){
            Constant t_i = factory.conLookup("T"+i);
            Constant t_j = factory.conLookup("T"+ (i+1));
            
        }

    }
}