package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.Goal;
import org.nuim.cyclone.model.SrcInfo;
import org.nuim.cyclone.model.ForExpr;
import org.nuim.cyclone.model.StopExpr;

public class ASTGoal extends ASTExpression{
    private Token token;
    private ASTForExpression astfor;
    private ASTStopExpression aststop;

    public ASTGoal(Token token){
        super();
    }

    public ASTGoal(){
        super();
    }

    public void setToken(Token token){this.token=token;}
    public Token token(){return this.token;}
    public void setFor(ASTForExpression astfor) {this.astfor=astfor;}
    public void setStop(ASTStopExpression aststop){this.aststop=aststop;}

    public Goal gen(ASTContext context) throws SemanticException{
        Goal goal = new Goal(new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()));
        ForExpr forexpr = astfor.gen(context);
        goal.setForExpr(forexpr);
        if (aststop!=null) {
            StopExpr stopexpr = aststop.gen(context);
            goal.setStopExpr(stopexpr);
        }
        return goal;
    }
    
}