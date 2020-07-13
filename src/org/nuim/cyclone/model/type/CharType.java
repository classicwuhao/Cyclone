package org.nuim.cyclone.model.type;

public class CharType extends Type {

    public CharType(){
        super("char");
    }

    @Override
    public boolean isCharType(){return true;}
    
    @Override
    public String toString(){return this.name();}

}