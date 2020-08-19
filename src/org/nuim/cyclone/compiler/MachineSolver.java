package org.nuim.cyclone.compiler;
import org.nuim.cyclone.compiler.gen.PathGenerator;
import uran.formula.smt2.SMT2Writer;
import uran.solver.*;
import uran.formula.*;
import uran.formula.value.*;
import java.util.List;
import java.util.ArrayList;

public class MachineSolver {
    private PathGenerator path;
    private SMT2Writer writer;
    private FunctionFactory factory;
    private List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
    private long time;

    public MachineSolver(PathGenerator path){
        this.path=path;
        this.factory = path.factory();
    }
    
    public Result solve(){
        long p1 = System.currentTimeMillis();
        try{
            this.path.gen_with_finals();
        }
        catch(GenerationException e){
            System.err.println(e.getMessage());
        }
        formulas.addAll(this.path.constraints());
        writer = new SMT2Writer(path.matrix().machine().filename()+".smt2",this.factory,formulas);
        Z3SMT2Solver solver = new Z3SMT2Solver(writer);
        Result result = solver.solve();
        
        time = System.currentTimeMillis()-p1;
        return result;
    }

    public long time(){return this.time;}

    public String Path(){
        StringBuffer sb = new StringBuffer();
        for (Function f : this.path.trace()){
            Value value = this.factory.getValue(f.name());
            sb.append(f.name()+"["+value.toString()+"] ");
        }
        return sb.toString();
    }


}