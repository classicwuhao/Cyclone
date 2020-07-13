package org.nuim.cyclone.model.value;
import org.nuim.cyclone.model.type.StringType;

public class StringValue extends Value{
    private String value;

    public StringValue(String value){
        super(new StringType());
        this.value=value;
    }

    public String value(){return this.value;}
    
    @Override
    public String toString(){return this.value;}
    
    @Override
    public boolean isStringValue(){return true;}

}