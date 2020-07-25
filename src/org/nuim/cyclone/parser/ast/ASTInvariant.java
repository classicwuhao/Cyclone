package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.SrcInfo;
import org.nuim.cyclone.model.Expression;
import org.nuim.cyclone.model.Invariant;

public class ASTInvariant extends ASTExpression {
    private ASTExpression expression;
    private Token token;

    public ASTInvariant(Token token, ASTExpression expr){
        this.token=token;
        this.expression=expr;

    }

    public void setExpression(ASTExpression expr){
        this.expression=expr;
    }

    public void setToken(Token token){this.token=token;}
    public Token token(){return this.token;}
    public ASTExpression expr(){return this.expression;}

    public Expression gen (ASTContext context) throws SemanticException{
        return 
                new Invariant(this.expression.gen(context),
                    new SrcInfo(this.token.getText(),this.token.getLine(),this.token.getCharPositionInLine()));
    }
    
    public String toString(){
        return this.expression.toString();
    }

}