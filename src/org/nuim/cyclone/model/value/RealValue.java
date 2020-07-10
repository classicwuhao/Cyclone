package org.nuim.cyclone.model.value;
import org.nuim.cyclone.model.type.RealType;

public class RealValue extends Value{

    private float value;

    public RealValue(float value){
        super(new RealType());
        this.value=value;
    }

    public float value(){return this.value;}
    
    @Override
    public String toString(){return Float.toString(this.value);}

    @Override
    public boolean isRealValue(){return true;}
}