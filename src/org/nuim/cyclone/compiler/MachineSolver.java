package org.nuim.cyclone.compiler;
import org.nuim.cyclone.compiler.gen.PathGenerator;
import uran.formula.smt2.SMT2Writer;
import uran.solver.*;
import uran.formula.*;
import uran.formula.value.*;
import java.util.List;
import java.util.ArrayList;
import org.nuim.cyclone.model.Machine;
import org.nuim.cyclone.model.Goal;

public class MachineSolver {
    private PathGenerator path;
    private SMT2Writer writer;
    private FunctionFactory factory;
    private List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
    private List<String> allpath = new ArrayList<String>();
    private long time;

    public MachineSolver(PathGenerator path){
        this.path=path;
        this.factory = path.factory();
    }
    
    public Result solve(){
        Machine machine = this.path.matrix().machine();
        Goal goal = machine.getGoal();

        if (!goal.enumerate()){
            return solve1();
        }
        else{
            return enumerate();
        }
    }
    /* solve for one */ 
    public Result solve1(){
        long p1 = System.currentTimeMillis();
        try{
            this.path.gen_with_finals();
        }
        catch(GenerationException e){
            System.err.println(e.getMessage());
            return Result.UNKNOWN;
        }
        formulas.addAll(this.path.constraints());
        writer = new SMT2Writer(path.matrix().machine().filename()+".smt2",this.factory,formulas);
        Z3SMT2Solver solver = new Z3SMT2Solver(writer);
        Result result = solver.solve();
        //allpath.add(this.Path());
        time = System.currentTimeMillis()-p1;
        //writer.clean();
        return result;
    }

    public long time(){return this.time;}

    /* find all */
    private Result enumerate(){
        int count=0;
        long p1 = System.currentTimeMillis();
        allpath.clear();
        try{
            this.path.gen_with_finals();
        }
        catch(GenerationException e){
            System.err.println(e.getMessage());
            return Result.UNKNOWN;
        }
        formulas.addAll(this.path.constraints());
        writer = new SMT2Writer(path.matrix().machine().filename()+".smt2",this.factory,formulas);
        Z3SMT2Solver solver = new Z3SMT2Solver(writer);

        Result result = Result.SAT;
        while (true){
            result = solver.solve();
            if (result==Result.SAT){
                writer.append(writer.getFactory().negConstants());
                this.AddPath(this.Path());
                count++;
            }else{
                break;
            }
        }
        
        time = System.currentTimeMillis()-p1;
        writer.clean();
        return (count>0) ? Result.SAT : result;
    }

    public String Path(){
        //StringBuffer raw = new StringBuffer();
        StringBuffer sb = new StringBuffer();

        /*for (Function f : this.path.trace()){
            Value value = this.factory.getValue(f.name());
            raw.append(f.name()+"["+value.toString()+"] ");
            sb.append(this.path.matrix().get(((IntValue)value).getValue()) +" ");
        }*/
        
        for (int i=0;i<this.path.trace().size()-1;i++){
            Function f = this.path.trace().get(i);
            Value value = this.factory.getValue(f.name());
            sb.append(this.path.matrix().get(((IntValue)value).getValue()).name() +"->");
        }

        Function f = this.path.trace().get(this.path.trace().size()-1); 
        Value value = this.factory.getValue(f.name());
        sb.append(this.path.matrix().get(((IntValue)value).getValue()).name());

        return sb.toString();
    }

    private void AddPath(String path){
        allpath.add(path);
    }

    List<String> AllPath(){
        return this.allpath;
    }

    public boolean isEnumerative(){
        Machine machine = this.path.matrix().machine();
        Goal goal = machine.getGoal();
        return goal.enumerate();
    }
}