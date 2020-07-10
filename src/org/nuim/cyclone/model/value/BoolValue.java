package org.nuim.cyclone.model.value;
import org.nuim.cyclone.model.type.BoolType;

public class BoolValue extends Value{
    private boolean value;

    public BoolValue(boolean value){
        super(new BoolType());
        this.value=value;
    }

    public boolean value(){return this.value;}
    
    @Override
    public String toString(){return Boolean.toString(this.value);}
    
    @Override
    public boolean isBoolValue(){return true;}
}