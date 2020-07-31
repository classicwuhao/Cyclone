package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.GlobalVariables;
import org.nuim.cyclone.model.Machine;
import org.nuim.cyclone.model.State;
import org.nuim.cyclone.model.Transition;
import org.nuim.cyclone.model.InvalidSpecException;
import java.util.List;
import java.util.ArrayList;

/*  
 * AST for our machine
 */ 
public class ASTMachine extends ASTExpression{
    private GlobalVariables variables = new GlobalVariables();
    private List<ASTState> states = new ArrayList<ASTState>();
    private List<ASTInvariant> invaraints = new ArrayList<ASTInvariant>();
    private List<ASTTransition> transitions = new ArrayList<ASTTransition>();

    Machine machine;

    public ASTMachine(String name){
        super(name);
        machine = new Machine();
        this.setContext(new ASTContext());
        //context.setVariables(variables);
        this.context().setVariables(variables);
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();

        sb.append(this.name());
        return sb.toString();
    }
    
    public void addState(ASTState state){
        this.states.add(state);
    }

    public void addTrans(ASTTransition trans){
        this.transitions.add(trans);
    }

    public void addVariable(ASTVariable node){
        try{
            //this.context.variables().add(node.gen(this.context));
            variables.add(node.gen(this.context()));
        }
        catch (SemanticException e){
            System.err.println(e.getMessage());
        }
    } 

    @Override
    /* generate our Machine */ 
    public Machine gen(ASTContext context){
        
        machine.setName(this.name());
        machine.setVariables(this.variables);
        context = this.context();
        context.setVariables(variables);

        for (int i=0;i<this.states.size();i++){
            ASTState aststate = this.states.get(i);
            try{
                State state = aststate.gen(context);
                machine.addState(state);
                context.push(state);
            }
            catch(SemanticException e){
                System.err.println("State "+ aststate.name()+ " cannot be generated - "+e.getMessage());
                //context.logError(aststate.token()," cannot generate state",true);
            }
            catch(InvalidSpecException e){ // we do not log error here as it is recorded.
                System.err.println(e.getMessage());
            }
        }

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
        return machine;
    }
    
}