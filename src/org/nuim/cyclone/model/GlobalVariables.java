package org.nuim.cyclone.model;
import java.util.List;
import java.util.ArrayList;
import org.nuim.cyclone.parser.ast.SymTable64; //use 64bit symbol table
import org.nuim.cyclone.parser.ast.SemanticException;
/* Wrapper for our symbol table. Seperate machine construction from AST travesal.*/ 
public final class GlobalVariables extends Element{
    private SymTable64 variables = new SymTable64();

    public GlobalVariables (){
        super("global variables");
    }

    public void add(Variable var){
        try{
            variables.store(var);
        }
        catch (SemanticException e){
            System.err.println("org.nuim.cyclone.model.GlobalVariables: "+e.getMessage());
        }
    }
    public Variable getVariable(String var){return variables.lookup(var);}
    
    public String toString(){
        return variables.toString();
    }
}