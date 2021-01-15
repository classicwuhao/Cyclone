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
    private Z3SMT2Solver solver;
    private boolean SOLVED_BEFORE = false;
    private boolean has_next = true;
    private PathResultCollection prc = new PathResultCollection();

    public MachineSolver(PathGenerator path){
        this.path=path;
        this.factory = path.factory();
    }
    
    public PathResult solve(){
        Machine machine = this.path.matrix().machine();
        Goal goal = machine.getGoal();

        if (!goal.enumerate()){
            return solve1();
        }
        else{
            PathResultCollection prc = enumerate();
            if (prc.size()>0) {
                return prc.get(0);
            }
            else{
                return new PathResult(Result.UNSAT,"",0);
            }
            //return next();
        }
    }
    /* solve for one */ 
    public PathResult solve1(){
        long p1 = System.currentTimeMillis();
        PathResult pr = new PathResult();
        try{
            this.path.gen_with_finals();
        }
        catch(GenerationException e){
            System.err.println(e.getMessage());
            pr.setResult(Result.UNKNOWN);
            return pr;
        }
        formulas.addAll(this.path.constraints());
        writer = new SMT2Writer(path.matrix().machine().filename()+".smt2",this.factory,formulas);
        this.solver = new Z3SMT2Solver(writer);
        Result result = solver.solve();
        //allpath.add(this.Path());
        time = System.currentTimeMillis()-p1;
        pr.setResult(result);
        pr.setTime(time);
        pr.setPath(this.Path());
        //writer.clean();
        
        return pr;
    }

    public long time(){return this.time;}

    /* find all */
    private PathResultCollection enumerate(){
        /*int count=0;
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
        this.solver = new Z3SMT2Solver(writer);

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
        
        return (count>0) ? Result.SAT : result;*/
        long p1 = System.currentTimeMillis();
        while (this.hasNext()){
            PathResult pr = next();
            // we dont know how many of them, use an if to make sure the collection contains no empty slot (to be optimised here).
            if (pr.result()==Result.SAT) prc.addPathResult(pr); 
        }

        return prc;
    }

    /* @TODO: add next() method for a proper iteration */ 
    public PathResult next(){
        PathResult pr = new PathResult();
        long p1 = System.currentTimeMillis();

        if (!SOLVED_BEFORE){
            try{
                this.path.gen_with_finals();
            }
            catch(GenerationException e){
                System.err.println(e.getMessage());
                pr.setResult(Result.UNKNOWN);
                return pr;
            }

            formulas.addAll(this.path.constraints());
            writer = new SMT2Writer(path.matrix().machine().filename()+".smt2",this.factory,formulas);
            this.solver = new Z3SMT2Solver(writer);
        }

        Result result = solver.solve();
        time = System.currentTimeMillis()-p1;
        if (result == Result.SAT){
            this.has_next=true;
            this.writer.append(writer.getFactory().negConstants());
            pr.setPath(this.Path());
        }else{
            this.has_next=false;
        }

        pr.setResult(result);
        pr.setTime(time);

        SOLVED_BEFORE=true;
        return pr;
    }

    public boolean hasNext(){
        return this.has_next;
    }

    private String Path(){
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

    public PathResultCollection PathCollection(){
        return this.prc;
    }

    private void AddPath(String path){
        allpath.add(path);
    }

    List<String> AllPath(){
        return this.allpath;
    }

    public String Path(int i){
        return this.allpath.get(i);
    }
    
    /* need to use solver.name() once content constraint generation is implemented. */
    public String solver(){
        return "Z3";
    }

    public int size(){
        return this.path.formula_size();
    }

    public boolean isEnumerative(){
        Machine machine = this.path.matrix().machine();
        Goal goal = machine.getGoal();
        return goal.enumerate();
    }
}