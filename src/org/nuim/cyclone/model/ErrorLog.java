package org.nuim.cyclone.model;
import java.io.*;
import java.util.Stack;

public class ErrorLog extends NamedElement{
    private int errors=0; //number of semantic errors.
    private PrintWriter errOut;
    private Stack<String> errStack = new Stack<String>();

    
    /*public void logError(Token token, String message, boolean flag){
        if (flag) errors++;
        errStack.push("Line :" +token.getLine()+ ":"+token.getCharPositionInLine()+":"+message);
    }*/

    public void logErrors(int k){
        this.errors+=k;
    }
    
    public int errors(){return this.errors;}
}