package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.Machine;
import org.nuim.cyclone.model.GlobalVariables;

/*  
 * AST for our machine
 */ 
public class ASTMachine extends ASTExpression{
    private GlobalVariables variables = new GlobalVariables();
    //private ASTContext context =  new ASTContext();
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

    public void addVariable(ASTVariable node){
        try{
            //this.context.variables().add(node.gen(this.context));
            variables.add(node.gen(this.context()));
        }
        catch (SemanticException e){
            System.err.println("Semantic error: cannot generate variable, "+e.getMessage());
        }
    } 

    @Override
    /* generate our Machine */ 
    public Machine gen(ASTContext context){
        
        machine.setName(this.name());
        machine.setVariables(this.variables);
    
        return machine;
    }
    
}