package org.nuim.cyclone.parser.ast;

import org.nuim.cyclone.model.type.Type;
import org.nuim.cyclone.model.value.Value;
import org.nuim.cyclone.model.Variable;

public class ASTVariable {
    private Variable variable;
    public Type type;
    public String name;
    public Value value;

    public ASTVariable(){}
    /* create a new variable for our machine */
    public void createVariable(){this.variable=new Variable(type,name);}
    
    public ASTVariable(String name, Type type){
        variable = new Variable(type, name);
    }

    public Variable variable(){return this.variable;}
}