package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.Transition;
import org.nuim.cyclone.model.SrcInfo;

public class ASTTransition extends ASTExpression{
    private Token token;
    private ASTExpression condition;
    private String label;

    public ASTTransition (Token token, String label){
        super(token.getText());
        this.token=token;
        this.label=label;
    }

    public void setLabel(String label){
        this.label = label;
    }

    public void setExpression(ASTExpression expr){
        this.condition = expr;
    }

    public String label(){return this.label;}
    public ASTExpression condition(){return this.condition;}

    public Transition gen(ASTContext context) throws SemanticException{
        Transition trans = new Transition(this.name());
        

        return trans;
    }

}