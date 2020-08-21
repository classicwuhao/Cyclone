package org.nuim.cyclone.parser.ast;
import java.util.List;
import java.util.ArrayList;
import org.nuim.cyclone.model.SrcInfo;
import org.nuim.cyclone.model.ViaExpr;
import org.nuim.cyclone.model.PathExpr;
import org.antlr.runtime.Token;

public class ASTViaExpression extends ASTExpression {
    private List<ASTPathExpression> pathexpr = new ArrayList<ASTPathExpression>();
    private Token token;

    public ASTViaExpression(){
        super();
    }

    public void addPathExpr(ASTPathExpression expr){
        pathexpr.add(expr);
    }

    public Token token(){return this.token;}
    public void setToken(Token token){this.token=token;}

    public ViaExpr gen (ASTContext context) throws SemanticException{
        ViaExpr viaexpr = new ViaExpr(new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()));
        
        for (ASTPathExpression expr : pathexpr){
            viaexpr.addExpr((PathExpr)expr.gen(context));
        }

        return viaexpr;
    }
}