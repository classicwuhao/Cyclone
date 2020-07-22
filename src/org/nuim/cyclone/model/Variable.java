package org.nuim.cyclone.model;
import org.nuim.cyclone.model.type.Type;
import org.nuim.cyclone.model.value.Value;

public class Variable extends Expression{
    private Value value; // for simple literal
    Expression initializer; // for complex expression rather than simple literal
    Expression constraint;
    

    public Variable (Type type, String name){
        super(name,type);
    }

    public Variable (Type type, String name, Value value){
        super(name,type);
        this.value = value;
    }

    public Value value(){return this.value;}
    public boolean hasValue(){return !(this.value==null);};
    public void setValue(Value value){this.value=value;}
    public void setInitializer(Expression expr){
        this.initializer=expr;
    }
    public void setConstraint(Expression expr){
        this.constraint=expr;
    }
    public Expression initializer(){return this.initializer;}
    public Expression constraint(){return this.constraint;}

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.name()+":"+this.type());
        
        if (this.value!=null){
            sb.append("["+this.value.toString()+"]");
        }
        
        if (this.initializer!=null){
            sb.append("["+this.initializer.toString()+"]");
        }

        if (this.constraint!=null){
            sb.append("["+this.constraint.toString()+"]");
        }
        
        return sb.toString();
    }
    
}