package org.nuim.cyclone.model.type;

public class StringType extends Type {

    public StringType(){
        super("string");
    }

    @Override
    public boolean isStringType(){return true;}
    
    @Override
    public String toString(){return this.name();}

}