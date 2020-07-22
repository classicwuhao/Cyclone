package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.NamedElement;
import org.nuim.cyclone.model.GlobalVariables;
import org.nuim.cyclone.model.Variable;
import org.nuim.cyclone.model.type.*;
import org.nuim.cyclone.util.Entry;
import org.antlr.runtime.Token;
import java.io.*;
import java.util.Stack;

/*
 * Context information when we traverse ASTs.
 * */ 
public class ASTContext extends NamedElement{

    private GlobalVariables variables;
    private SymTable64 localVariables;
    private int errors=0; //number of semantic errors.
    private PrintWriter errOut;
    private Stack<String> errStack = new Stack<String>();
    private boolean flag=false; //use a flag for multi-purposes:where expression.
    private Entry<String,Variable> localInfo; // used for where epxression.

    public ASTContext(){
        super();
        initialisation();
    }

    public ASTContext(String name){
        super(name);
        initialisation();
    }

    public ASTContext(GlobalVariables variables){
        super();
        this.variables = variables;
        initialisation();
    }

    private void initialisation(){
        localVariables =  new SymTable64();
    }

    public void setVariables(GlobalVariables variables){this.variables=variables;}
    public GlobalVariables variables(){return this.variables;}
    public void setLocalVariables(SymTable64 table){
        this.localVariables=table;
    }
    public SymTable64 local_variables(){return this.localVariables;}

    public void setFlag(){this.flag=true;}
    public void resetFlag(){this.flag=false;}
    public boolean flag(){return this.flag;}
    
    public void setLocalInfo(String name, Variable var){
        this.localInfo = new Entry<String,Variable>(name,var);
    }   

    public String getLocalInfo(){
        return this.localInfo.first();
    }

    public Variable containsLocalInfo(String name){
        return this.localInfo.contains(name);
    }

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