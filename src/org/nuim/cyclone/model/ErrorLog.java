package org.nuim.cyclone.model;
import java.io.*;
import java.util.Stack;
import org.nuim.cyclone.util.Entry;

public class ErrorLog extends NamedElement{
    private int errors=0; //number of semantic errors.
    private PrintWriter errOut;
    private Stack<Entry<SrcInfo,String>> errStack = new Stack< Entry<SrcInfo,String>>();
    
    /*public void logError(Token token, String message, boolean flag){
        if (flag) errors++;
        errStack.push("Line :" +token.getLine()+ ":"+token.getCharPositionInLine()+":"+message);
    }*/

    public void logErrors(int k){
        this.errors+=k;
    }
    
    /* general log for all error messages */ 
    public void logErrors(SrcInfo info, String message){
        this.errors++;
        errStack.push(new Entry<SrcInfo, String>(info,message));
    }
    
    public int errors(){return this.errors;}
}