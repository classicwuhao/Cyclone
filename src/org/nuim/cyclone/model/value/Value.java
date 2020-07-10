package org.nuim.cyclone.model.value;

import org.nuim.cyclone.model.type.Type;

public abstract class Value {
    // ecah value has its type.
    private Type type;

    protected Value(Type type){
        this.type = type;
    }

    public abstract String toString();
    public Type type(){return this.type;};
    public boolean isIntValue(){return false;}
    public boolean isBoolValue(){return false;}
    public boolean isRealValue(){return false;}
    public boolean isEnumValue(){return false;}
}