package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.SpecialState;
public abstract class ASTPathOperator extends ASTExpression {
    private Token token;
    public ASTPathOperator (){
        super();
    }

    public ASTPathOperator(Token token){
        super();
        this.token = token;
    }

    public Token token(){return this.token;}
    
    public String operator(){return this.token.getText();}
    public abstract SpecialState gen(ASTContext context) throws SemanticException;

    public enum Operator{
        ONE{public String toString(){return "_";}}, 
        ZERO_OR_ONE{public String toString(){return "?";}},
        ZERO_OR_MORE{public String toString(){return "*";}},
        ONE_OR_MORE{public String toString(){return "+";}}
    }

}