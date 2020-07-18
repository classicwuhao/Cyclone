package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.Expression;
import org.nuim.cyclone.model.IdentExpr;

public class ASTIdentifier  extends ASTExpression {
    private Token token;

    public ASTIdentifier (Token token){
        super(token.getText());
        this.token=token;
    }

    public String toString(){return this.token.getText();}
    public String identifier(){return this.token.getText();}
    
    public Expression gen(){
        return new IdentExpr(this.token.getText());
    }

}