package org.nuim.cyclone.parser.ast;

import org.nuim.cyclone.model.type.Type;
import org.nuim.cyclone.model.value.Value;
import org.nuim.cyclone.model.Variable;

public class ASTVariable extends ASTNode{
    private Variable variable;
    public Type type;
    public String name;
    public Value value;

    public ASTVariable(){super();}
    /* create a new variable for our machine */
    public void createVariable(){this.variable=new Variable(type,name);}
    public Variable variable(){return this.variable;}
    
    @Override
    public Variable gen(){
        if (this.variable==null)
            createVariable();

        return this.variable;
    }

    @Override
    public String toString(){
        return (this.variable==null) ? 
            "variable null" :
            this.variable.toString(); 
    }
}