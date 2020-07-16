package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;

public class ASTConditionalOrExpression extends ASTBinaryExpression{
    Token token;
    ASTExpression left;
    ASTExpression right;

    public ASTConditionalOrExpression (Token token, ASTExpression left, ASTExpression right){
        super(token, left, right);
    }
    
}