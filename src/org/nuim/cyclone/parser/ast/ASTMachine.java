package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.Machine;
import org.nuim.cyclone.model.GlobalVariables;

/*  
 * AST for our machine
 */ 
public class ASTMachine extends ASTNode{
    private GlobalVariables variables = new GlobalVariables();

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
        try{
            variables.add(node.gen());
        }
        catch (SemanticException e){
            System.err.println("Semantic error: cannot generate variable, "+e.getMessage());
        }
    } 

    @Override
    /* generate our Machine */ 
    public Machine gen(){
        Machine machine = new Machine(this.name());

        machine.setVariables(this.variables);
        return machine;
    }
    
}