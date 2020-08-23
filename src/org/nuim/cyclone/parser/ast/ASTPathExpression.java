package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;

public abstract class ASTPathExpression extends ASTExpression {
    private Token token;
    public ASTPathExpression(){
        super();
    }

    public ASTPathExpression(Token token){
        super(token.getText());
    }

    public Token token(){
        return this.token;
    }

    public void setToken(Token token){this.token=token;}
    public boolean isStateInclusion(){return false;}
    public boolean isTransInclusion(){return false;}
    //public boolean isOneOreMoreSteps(){return false;}

}