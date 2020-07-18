package org.nuim.cyclone.model;
import org.nuim.cyclone.model.type.Type;
import org.nuim.cyclone.model.value.Value;

public class Variable extends Expression{
    private Value value;
    
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
    
    @Override
    public String toString(){
            return (this.value==null) ? 
                    this.name() +":"+this.type()
                :
                    this.name()+":"+this.type()+"["+this.value.toString()+"]";
    }
    
}