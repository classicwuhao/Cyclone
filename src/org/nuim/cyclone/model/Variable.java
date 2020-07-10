package org.nuim.cyclone.model;
import org.nuim.cyclone.model.type.Type;
import org.nuim.cyclone.model.value.Value;

public class Variable {
    private Type type;
    private String name;
    private Value value;
    
    public Variable (Type type, String name){
        this.type = type;
        this.name = name;
    }

    public Variable (Type type, String name, Value value){
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public Type type(){return this.type;}
    public Value value(){return this.value;}
    public boolean hasValue(){return !(this.value==null);};

    public String name(){return this.name;}
    public String toString(){
            return (this.value==null) ? 
                    this.name +":"+this.type
                :
                    this.name+":"+this.type+"["+this.value.toString()+"]";
    }
    
}