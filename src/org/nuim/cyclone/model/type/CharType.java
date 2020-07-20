package org.nuim.cyclone.model.type;

public class CharType extends PrimitiveType {

    public CharType(){
        super("char");
    }

    @Override
    public boolean isCharType(){return true;}
    
    @Override
    public String toString(){return this.name();}

}