package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.*; 

public class ASTBinaryExpression extends ASTExpression{
    Token token;
    ASTExpression left;
    ASTExpression right;

    public ASTBinaryExpression(Token token, ASTExpression left, ASTExpression right){
        super(token.getText());
        this.token = token;
        this.left = left;
        this.right = right;
    }

    public ASTExpression left(){return this.left;}
    public ASTExpression right(){return this.right;}

    public String toString(){
        return this.left.toString() + " " +token.getText() + " " +this.right.toString();
    }
    
    public Expression gen(){
        return null;
    }

}