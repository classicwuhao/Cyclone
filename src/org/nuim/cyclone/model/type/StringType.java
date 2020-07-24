package org.nuim.cyclone.model.type;

public class StringType extends PrimitiveType {

    public StringType(){
        super("string");
    }

    @Override
    public boolean isStringType(){return true;}
    
    @Override
    public String toString(){return this.name();}

}