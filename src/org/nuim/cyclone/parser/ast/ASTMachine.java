package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.GlobalVariables;
import org.nuim.cyclone.model.Machine;
import org.nuim.cyclone.model.State;
import org.nuim.cyclone.model.Transition;
import org.nuim.cyclone.model.InvalidSpecException;
import org.nuim.cyclone.model.Invariant;
import java.util.List;
import java.util.ArrayList;

/*  
 * AST for our machine
 */ 
public class ASTMachine extends ASTExpression{
    private GlobalVariables variables = new GlobalVariables();
    private List<ASTVariable> vars = new ArrayList<ASTVariable>();
    private List<ASTState> states = new ArrayList<ASTState>();
    private List<ASTInvariant> invariants = new ArrayList<ASTInvariant>();
    private List<ASTTransition> transitions = new ArrayList<ASTTransition>();
    private Machine machine;
    private ASTGoal goal;

    public ASTMachine(String name){
        super(name);
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();

        sb.append(this.name());
        return sb.toString();
    }

    public void addVariable(ASTVariable node){
        vars.add(node);
    } 

    public void addState(ASTState state){
        this.states.add(state);
    }

    public void addTrans(ASTTransition trans){
        this.transitions.add(trans);
    }

    public void addInv(ASTInvariant inv){
        this.invariants.add(inv);
    }

    public void addGoal(ASTGoal goal){
        this.goal=goal;
    }

    @Override
    /* generate our Machine */ 
    public Machine gen(ASTContext context){
        machine = new Machine(this.name());
        context.setVariables(this.variables);
        this.setContext(context);
        machine.setFileName(context.name());
        /* 
         * Variables.
         * */ 
        for (ASTVariable var : vars){
            try{
                this.variables.add(var.gen(context));
            }
            catch(SemanticException e){
                context.out().println(e.getMessage());
            }
        }
        machine.setVariables(this.variables);
        /**
         * States.
         */
        for (int i=0;i<this.states.size();i++){
            ASTState aststate = this.states.get(i);
            try{
                State state = aststate.gen(context);
                machine.addState(state);
                context.push(state);
            }
            catch(SemanticException e){
                System.err.println("State "+ aststate.name()+ " cannot be generated - "+e.getMessage());
            }
            catch(InvalidSpecException e){ // we do not log error here as it is recorded.
                System.err.println(e.getMessage());
                
            }
        }

        /**
         * Transitions.
         */
        for (int i=0;i<this.transitions.size();i++){
            ASTTransition asttran=this.transitions.get(i);
            try{
                Transition tran=asttran.gen(context);
                machine.addTrans(tran);
            }
            catch (SemanticException e){
                System.err.println("Transition "+asttran.name()+" cannot be generated - "+e.getMessage());
            }
            catch (InvalidSpecException e){ // no error log here.
                System.err.println(e.getMessage());
            }
        }

        /**
         * Invariants.
         */

        for (int i=0;i<this.invariants.size();i++){
            ASTInvariant astinv = this.invariants.get(i);
            try{
                Invariant inv = astinv.gen(context);
                machine.addInvariant(inv);
            }
            catch(SemanticException e){
                System.err.println("Invariant "+astinv.name()+" cannot be generated - "+e.getMessage());
            }
            catch (InvalidSpecException e){
                System.err.println(e.getMessage());
            }
        }
        
        /**
         * Goal
         */
        if (this.goal==null) return machine;
        
        try{
            machine.addGoal(this.goal.gen(context));
        }
        catch(SemanticException e){
            System.err.println("Invalid goal "+e.getMessage());
        }

        return machine;
    }
    
}