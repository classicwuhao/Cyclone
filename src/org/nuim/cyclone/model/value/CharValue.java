package org.nuim.cyclone.model.value;
import org.nuim.cyclone.model.type.CharType;

public class CharValue extends Value {
    private char value;

    public CharValue(char value){
        super(new CharType());
        this.value=value;
    }
    

    public char value(){return this.value;}

    @Override
    public String toString(){return String.valueOf(this.value);}
    
    @Override
    public boolean isCharValue(){return true;}

}