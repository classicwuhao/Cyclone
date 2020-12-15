package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.Goal;
import org.nuim.cyclone.model.SrcInfo;
import org.nuim.cyclone.model.ForExpr;
import org.nuim.cyclone.model.StopExpr;
import org.nuim.cyclone.model.ViaExpr;

public class ASTGoal extends ASTExpression{
    private Token token;
    private ASTForExpression astfor;
    private ASTStopExpression aststop;
    private ASTViaExpression astvia;
    private boolean enumerate;

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
    public void setVia(ASTViaExpression astvia){this.astvia=astvia;}
    public void setEnumerate(boolean enumerate){this.enumerate=enumerate;}
    
    public Goal gen(ASTContext context) throws SemanticException{
        Goal goal = new Goal(new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()));

        /* capture error: a for statement might be null. */ 
        if (astfor==null) {
            context.logError(token," undefined FOR statement.",true);
            throw new SemanticException(token, " undefined FOR statement.");
        }

        ForExpr forexpr = astfor.gen(context);
        goal.setForExpr(forexpr);
        goal.setEnumerate(this.enumerate);
        if (aststop!=null) {
            StopExpr stopexpr = aststop.gen(context);
            goal.setStopExpr(stopexpr);
        }

        if (astvia!=null){
            ViaExpr viaexpr = astvia.gen(context);
            goal.setViaExpr(viaexpr);
        }

        return goal;
    }
    
}