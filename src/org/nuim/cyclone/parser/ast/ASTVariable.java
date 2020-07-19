package org.nuim.cyclone.parser.ast;

import org.nuim.cyclone.model.type.Type;
import org.nuim.cyclone.model.Variable;

public class ASTVariable extends ASTExpression{
    private Variable variable;
    public Type type;
    public String name;
    public ASTExpression initializer;
    public ASTExpression constraint;
    
    public ASTVariable(){super();}
    /* create a new variable for our machine */
    public void createVariable(){this.variable=new Variable(type,name);}
    public Variable variable(){return this.variable;}
    
    @Override
    public Variable gen() throws SemanticException{
        if (this.variable==null)
            createVariable();

        /* leave complex expression to the solver. */ 
        if (this.initializer!=null){
            if (this.initializer.isASTLitreal()){
                ASTLiteral literal = (ASTLiteral)initializer;
                 this.variable.setValue(literal.gen());
            }
            else{
                this.variable.setInitializer(initializer.gen());
            }
        }

        return this.variable;
    }

    @Override
    public String toString(){
        return (this.variable==null) ? 
            "variable null" :
            this.variable.toString(); 
    }
}