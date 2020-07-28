package org.nuim.cyclone.model;
import org.nuim.cyclone.parser.ast.SymTable64;
import org.nuim.cyclone.parser.ast.SemanticException;
import java.util.List;
import java.util.ArrayList;

public class State extends Expression{
    private StateModifier modifier;
    private SymTable64 localVariables = new SymTable64();
    private List<Expression> expressions = new ArrayList<Expression>();
    private Machine owner=null;
    
    public State(){
        super();
    }

    public State(String name){
        super(name);
    }

    public State(String name, StateModifier modifier){
        super(name);
        this.modifier=modifier;
    }

    public StateModifier modifier(){return this.modifier;}
    public void setOwner(Machine machine){
        this.owner=machine;
    }
    public Machine owner(){return this.owner;}
    public void setModifier(StateModifier modifier){
        this.modifier=modifier;
    }
    public void addExpression(Expression expr){
        this.expressions.add(expr);
    }

    public void addVariable(Variable var){
        try{
            this.localVariables.store(var);
        }
        catch (SemanticException e){
            // error message
        }
    }

    public SymTable64 localVariables(){return this.localVariables;}
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.modifier.toString());
        sb.append(" ");
        sb.append(this.name());
        sb.append("\n ");
        sb.append(localVariables.toString()+" \n");

        for (Expression expr: this.expressions)
            sb.append(expr.toString()+"\n");

        return sb.toString();
    }
    
}   