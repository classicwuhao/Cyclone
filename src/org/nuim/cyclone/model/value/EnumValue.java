package org.nuim.cyclone.model.value;
import org.nuim.cyclone.model.type.EnumType;
import java.util.List;
import java.util.ArrayList;

public class EnumValue extends Value {
    private String value;

    public EnumValue(String value){
        super(new EnumType());
        this.value=value;
    }

    public String value(){return this.value;}
    
    @Override
    public String toString(){
        return "#" + this.value;
    }

    @Override
    public boolean isEnumValue(){return true;}
}