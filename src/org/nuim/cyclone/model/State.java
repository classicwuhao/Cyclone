package org.nuim.cyclone.model;
import org.nuim.cyclone.parser.ast.SymTable64;
import org.nuim.cyclone.parser.ast.SemanticException;
import org.nuim.cyclone.model.type.spec.StateType;
import org.nuim.cyclone.util.BitVector;
import java.util.List;
import java.util.ArrayList;

public class State extends Expression{
    /**
     * Modifier: START ABSTRACT FINAL 
     * Rule: NORMAL cannot be used with ABSTRACT
     */
    private BitVector modifier;
    private SymTable64 localVariables = new SymTable64();
    private List<Expression> expressions = new ArrayList<Expression>();
    private Machine owner=null;
    
    public State(){
        super(new StateType());
    }

    public State(SrcInfo info){
        super(info);
        this.setType(new StateType());
    }

    public State(String name){
        super(name, new StateType());
    }

    public State(String name, BitVector modifier){
        super(name, new StateType());
        this.modifier=modifier;
    }

    public BitVector modifier(){
        return this.modifier;
    }

    public void setOwner(Machine machine){
        this.owner=machine;
    }
    public Machine owner(){return this.owner;}

    public void setModifier(BitVector modifier) throws InvalidSpecException{
        if (modifier.and(110).equals(110)){
            logErrors(this.info(), " state cannot be normal and abstract at the same time.");
            throw new InvalidSpecException(this.info(), " state cannot be normal and abstract at the same time.");
        }
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
    public int size_of_variables(){return this.localVariables.size();}
    public int size_of_exprs(){return this.expressions.size();}
    public List<Expression> expressions(){return this.expressions;}
    
    public void clearAll(){
        this.localVariables.clear();
    }
    public SymTable64 localVariables(){return this.localVariables;}
    
    public boolean isStart(){
        return this.modifier.and(StateModifier.START.bits()).equals(StateModifier.START.bits());
    }

    public boolean isAbstract(){
        return this.modifier.and(StateModifier.ABSTRACT.bits()).equals(StateModifier.ABSTRACT.bits());
    }

    public boolean isNormal(){
        return this.modifier.and(StateModifier.NORMAL.bits()).equals(StateModifier.NORMAL.bits());
    }

    public boolean isFinal(){
        return this.modifier.and(StateModifier.FINAL.bits()).equals(StateModifier.FINAL.bits());
    }

    private String modifier2string(){
        String modistr="";
        if (this.modifier==null) return modistr;
        
        if (this.modifier.and(StateModifier.START.bits()).equals(StateModifier.START.bits()))
            modistr=StateModifier.START.toString();

        if (this.modifier.and(StateModifier.FINAL.bits()).equals(StateModifier.FINAL.bits()))
            modistr+=" "+StateModifier.FINAL.toString();

        if (this.modifier.and(StateModifier.NORMAL.bits()).equals(StateModifier.NORMAL.bits()))
            modistr+=" "+StateModifier.NORMAL.toString();
        
        if (this.modifier.and(StateModifier.ABSTRACT.bits()).equals(StateModifier.ABSTRACT.bits()))
            modistr+=" "+StateModifier.ABSTRACT.toString();
        
        return modistr;
    }

    @Override
    public boolean isState(){return true;}
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(modifier2string());
        sb.append(" ");
        sb.append(this.name());
        sb.append("\n ");
        sb.append(localVariables.toString()+" \n");

        for (Expression expr: this.expressions)
            sb.append(expr.toString()+"\n");

        return sb.toString();
    }
    
}   