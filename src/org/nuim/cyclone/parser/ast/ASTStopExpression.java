package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.State;
import org.nuim.cyclone.model.StopExpr;
import org.nuim.cyclone.model.SrcInfo;
import java.util.List;
import java.util.ArrayList;

public class ASTStopExpression extends ASTExpression{
    private Token token;
    private List<String> states = new ArrayList<String>();

    public ASTStopExpression(){
        super();
    }

    public ASTStopExpression(Token token){
        super();
        this.token=token;
    }

    public void setToken(Token token){
        this.token = token;
    }
    
    public void addState(String str){
        states.add(str);
    }

    public StopExpr gen (ASTContext context) throws SemanticException{
        StopExpr stopexpr = new StopExpr(new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()));
        for (String str : states){
            State s = context.fetch(str);
            if (s==null) {
                context.logError(token, " no state "+str+" is defined.",true);
                throw new SemanticException(token," no state "+str+" is defined.");
            }
            stopexpr.addStates(s);
        }
        return stopexpr;
    }

}