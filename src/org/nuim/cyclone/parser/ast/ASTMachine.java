package org.nuim.cyclone.parser.ast;
/*  
 * AST for our machine
 */ 
public class ASTMachine {

    private String name;
    private SymTable symbolTable = new SymTable();
    
    public ASTMachine(String name){

    }

    public String name(){return this.name;}

    public String toString(){
        StringBuffer sb = new StringBuffer();

        sb.append(this.name());
        sb.append("VAR:");
        sb.append(symbolTable.toString());
        return sb.toString();
    }   

    public void addVariable(Variable var){
        if (var!=null) 
            symbolTable.store(var);
        else
            throw new RuntimeException("Variable cannot be null.");
    }
}