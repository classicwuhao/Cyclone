package org.nuim.cyclone.model.value;

import org.nuim.cyclone.model.type.Type;
import org.nuim.cyclone.model.Expression;
public abstract class Value extends Expression{
    // ecah value has its type.
    //private Type type;
    protected Value(Type type){
        super(type);
    }

    //public abstract String toString();
   // public Type type(){return this.type();};
    public boolean isIntValue(){return false;}
    public boolean isBoolValue(){return false;}
    public boolean isRealValue(){return false;}
    public boolean isEnumValue(){return false;}
    public boolean isStringValue(){return false;}
    public boolean isCharValue(){return false;}
}