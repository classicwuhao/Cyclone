package org.nuim.cyclone.model;
import org.nuim.cyclone.model.type.spec.InvType;
import java.util.List;
import java.util.ArrayList;

public class Invariant extends Expression{
    private List<Expression> exprs = new ArrayList<Expression>();
    private Machine owner;
    List<State> states = new ArrayList<State>();

    public Invariant (){
        super(new InvType());
    }

    public Invariant (SrcInfo info){
        super(info);
        this.setType(new InvType());
    }

    public void addExpr(Expression expr){
        exprs.add(expr);
    }
    public void addState(State state){this.states.add(state);}
    public List<Expression> expressions(){return this.exprs;}
    public List<State> states(){return this.states;}
    public int size_of_states(){return this.states.size();}
    public int size_of_exprs(){return this.exprs.size();}
    public boolean isOverStates(){return this.states.size()>0;}

    public Machine owner(){return this.owner;}
    public void setOwner(Machine owner){this.owner=owner;}
    
    @Override
    public boolean isInvariant(){return true;}

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.name());
        sb.append(" {\n");
        for (Expression e : this.exprs)
            sb.append(e.toString()+" ");
        sb.append(" }");
        if (isOverStates()){
            sb.append(" for { ");
            for (int i=0;i<this.states.size()-1;i++) 
                sb.append(this.states.get(i).name()+" , ");
            sb.append(this.states.get(this.states.size()-1).name());
            sb.append(" }");
        }
        
        return sb.toString();
    }
    
}