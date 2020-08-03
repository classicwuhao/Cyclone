package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.NamedElement;
import org.nuim.cyclone.model.GlobalVariables;
import org.nuim.cyclone.model.Variable;
import org.nuim.cyclone.model.type.*;
import org.nuim.cyclone.model.State;
import org.nuim.cyclone.util.Entry;
import org.antlr.runtime.Token;
import java.io.*;
import java.util.Stack;
import java.util.Map;
import java.util.TreeMap;
/*
 * Context information when we traverse ASTs.
 * 
 * @TODO: we also need to record any warnning messages for users.
 * */ 
public class ASTContext extends NamedElement{
    private PrintWriter out; 
    private GlobalVariables variables;
    private SymTable64 localVariables;
    private int errors=0; //number of semantic errors.
    private PrintWriter errOut;
    private Stack<String> errStack = new Stack<String>();
    private Entry<String,Variable> localInfo; // used for where epxression.
    private String current_state; //use for state member accessor. Example: S1.x=prev(S1.x)+1
    private String extra_info; //use for extra information message.
    private Map<String, State> states = new TreeMap<String, State>();

    /* All important flags during AST traversal to help determine its semantics. */ 

    /* A general flag for multi-purposes:where expression. 
    *  set it to be true if we are traversing a where clause for a varible. See [ASTVariable], affects [ASTIdentifier]
    **/
    private boolean flag=false; 

    /* a transition flag: 
    *  Set it to be true during traversing a where clause inside a transition. See [ASTransition], affects [ASTIdentifier] && [ASTMember]
    *
    **/
    private boolean trans_where_flag=false;  
    
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

    public ASTContext (String name, PrintWriter out){
        super(name);
        this.out=out;
        initialisation();
    }

    private void initialisation(){
        localVariables =  new SymTable64();
    }

    public void push(State state){
        this.states.put(state.name(),state);
    }

    public State fetch(String name){
        return states.get(name);
    }

    public PrintWriter out(){return this.out;}

    public void setVariables(GlobalVariables variables){this.variables=variables;}
    public GlobalVariables variables(){return this.variables;}
    public void setLocalVariables(SymTable64 table){
        this.localVariables=table;
    }
    public SymTable64 local_variables(){return this.localVariables;}

    public void setFlag(){this.flag=true;}
    public void resetFlag(){this.flag=false;}
    public boolean flag(){return this.flag;}
    
    public void set_trans_flag(){this.trans_where_flag=true;}
    public void reset_trans_flag(){this.trans_where_flag=false;}
    public boolean trans_flag(){return this.trans_where_flag;}

    public void set_extra_info(String message){
        this.extra_info=message;
    }

    public String extra_info(){return this.extra_info;}
    
    public void setLocalInfo(String name, Variable var){
        this.localInfo = new Entry<String,Variable>(name,var);
    }   

    public String getLocalInfo(){
        return this.localInfo.first();
    }

    public void setState(String state){
        this.current_state=state;
    }

    public String state(){
        return this.current_state;
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