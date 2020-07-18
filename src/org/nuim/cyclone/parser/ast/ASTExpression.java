package org.nuim.cyclone.parser.ast;

public abstract class ASTExpression extends ASTNode {
    public ASTExpression(){super();}
    public ASTExpression(String name){
        super(name);
    }
    public boolean isASTLitreal(){return false;}
}