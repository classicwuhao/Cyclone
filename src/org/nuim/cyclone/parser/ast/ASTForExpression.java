package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.ForExpr;
import org.nuim.cyclone.model.SrcInfo;

public class ASTForExpression extends ASTExpression{
    private Token token;
    private int steps;

    public ASTForExpression(Token token, int steps){
        this.token = token;
        this.steps = steps;
    }


    public Token token(){return this.token;}
    public int steps(){return this.steps;}

    public void setToken(Token token){this.token=token;}
    public void setSteps(int steps){this.steps=steps;}


    public ForExpr gen(ASTContext context) throws SemanticException{
        if (this.steps<=0) {
            context.logError(token," positive step(s) is expected.",true);
            throw new SemanticException(token, " positive step(s) is expected.");
        }
        ForExpr forexpr = new ForExpr(new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()));
        forexpr.setSteps(this.steps);
        return forexpr;
    }

}