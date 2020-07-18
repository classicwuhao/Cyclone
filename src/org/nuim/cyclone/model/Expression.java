package org.nuim.cyclone.model;
import org.nuim.cyclone.model.type.Type;

public abstract class Expression extends NamedElement {
    private Type type;

    public Expression(String name){
        super(name);
    }

    public Expression(String name, Type type){
        super(name);
        this.type=type;
    }

    public Expression(Type type){
        super("");
        this.type=type;
    }

    public Type type(){return this.type;}
    public void setType(Type type){this.type=type;}

}