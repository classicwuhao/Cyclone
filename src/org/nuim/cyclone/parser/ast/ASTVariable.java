package org.nuim.cyclone.parser.ast;

import org.nuim.cyclone.model.type.Type;
import org.nuim.cyclone.model.Variable;
import org.nuim.cyclone.model.Expression;
import org.nuim.cyclone.model.type.BoolType;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.SrcInfo;

public class ASTVariable extends ASTExpression{
    private Variable variable;
    private Token token;
    public Type type;
    public String name;
    public ASTExpression initializer;
    public ASTExpression constraint;
    
    public ASTVariable(){super();}
    /* create a new variable for our machine */
    public void createVariable(){this.variable=new Variable(type,name);}
    public Variable variable(){return this.variable;}
    public void setToken(Token token){this.token=token;}

    @Override
    public Variable gen(ASTContext context) throws SemanticException{
        if (this.variable==null)
            createVariable();

        /* leave complex expression to the solver. */ 
        if (this.initializer!=null){
            if (this.initializer.isASTLitreal()){
                ASTLiteral literal = (ASTLiteral)initializer;
                 this.variable.setValue(literal.gen(context));
            }
            else{
                Expression expr = initializer.gen(context);
                if (!this.variable.type().equals(expr.type())){
                    context.logError(this.token,"Type mismatch: expression has type "+expr.type()+", expected type "+variable.type()+".",true);
                    throw new SemanticException(this.token," Type mismatch "+ 
                        "expression has type "+expr.type()+", expected type "+variable.type()+".");
                }
                this.variable.setInitializer(expr);
            }
        }

        /* 
        * there exists a constraint for this variable,
        * we need to put this variable into our symbol table now and set a flag.
        * we must check constraint expression's type.
        */ 
        if (this.constraint!=null){
            //context.variables().add(this.variable);
            context.setFlag();
            context.setLocalInfo(this.variable.name(),this.variable);
            Expression expr = this.constraint.gen(context);
            if (!expr.type().equals(new BoolType())){
                context.logError(this.token," constraint type is not bool. ",true);
                throw new SemanticException(this.token,"variable "+this.name+" expect bool type constraint.");
            }
            this.variable.setConstraint(expr);
            context.resetFlag();
        }


        variable.setSrcInfo(new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()));
        return this.variable;
    }

    @Override
    public String toString(){
        return (this.variable==null) ? 
            "variable null" :
            this.variable.toString(); 
    }
}