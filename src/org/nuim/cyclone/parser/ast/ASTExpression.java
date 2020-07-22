package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.Expression;

public abstract class ASTExpression extends ASTNode {
    private ASTContext context;

    public ASTExpression(){super();}
    public ASTExpression(String name){
        super(name);
    }
    public ASTExpression (ASTContext context){
        super();
        this.context=context;
    }
    
    public boolean isASTLitreal(){return false;}
    public ASTContext context(){return this.context;}
    public void setContext(ASTContext context){this.context=context;}
    public abstract Expression gen(ASTContext context) throws SemanticException;
    

}