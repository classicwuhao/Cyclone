package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.*;

public class ASTUnaryExpression extends ASTExpression{
    private Token token;
    private ASTExpression expression;


    public ASTUnaryExpression(Token token, ASTExpression expr){
        this.token = token;
        this.expression = expr;
    }

    public ASTExpression expression(){
        return this.expression;
    }

    public String toString(){
        return token.getText()+" "+this.expression.toString();
    }

    public Expression gen(ASTContext context) throws SemanticException{
        Expression[] arg = new Expression[1];
        arg[0]=expression.gen(context);

        return new OpExpr(token.getText(),arg);
    }

}