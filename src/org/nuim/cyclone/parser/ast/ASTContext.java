package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.NamedElement;
import org.nuim.cyclone.model.GlobalVariables;
import org.antlr.runtime.Token;
import java.io.*;
import java.util.Stack;

/*
 * Context information when we traverse ASTs.
 * */ 
public class ASTContext extends NamedElement{

    private GlobalVariables variables;
    private int errors=0; //number of semantic errors.
    private PrintWriter errOut;
    private Stack<String> errStack = new Stack<String>();

    public ASTContext(){}

    public ASTContext(String name){
        super(name);
    }

    public ASTContext(GlobalVariables variables){
        super();
        this.variables = variables;
    }

    public void setVariables(GlobalVariables variables){this.variables=variables;}
    public GlobalVariables variables(){return this.variables;}

    public void reportError(Token token, String message){
        errors++;
        errOut.println("Line :" +token.getLine()+ ":"+token.getCharPositionInLine()+":"+message);
    }
    
    public void logError(Token token, String message, boolean flag){
        if (flag) errors++;
        errStack.push("Line :" +token.getLine()+ ":"+token.getCharPositionInLine()+":"+message);
    }
    
    public int errors(){return this.errors;}

}