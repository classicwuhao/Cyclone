package org.nuim.cyclone.model.value;
import org.nuim.cyclone.model.type.IntType;

public class IntValue extends Value{
    private int value;

    public IntValue(int value){
        super(new IntType());
        this.value=value;
    }

    public int value(){return this.value;}

    @Override
    public String toString(){return Integer.toString(this.value);}
    
    @Override
    public boolean isIntValue(){return true;}

}