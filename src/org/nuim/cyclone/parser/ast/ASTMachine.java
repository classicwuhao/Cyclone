package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.Machine;
import org.nuim.cyclone.model.Variable;
import org.nuim.cyclone.model.GlobalVariables;

/*  
 * AST for our machine
 */ 
public class ASTMachine extends ASTNode{
    private String name;
    private GlobalVariables variables = new GlobalVariables();

    public ASTMachine(String name){
        this.name = name;
    }

    public String name(){return this.name;}

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();

        sb.append(this.name());
        return sb.toString();
    }   

    public void addVariable(ASTVariable node){
        variables.add(node.gen());
    } 

    @Override
    /* generate our Machine */ 
    public Machine gen(){
        Machine machine = new Machine(this.name);

        machine.setVariables(this.variables);
        return machine;
    }
    
}