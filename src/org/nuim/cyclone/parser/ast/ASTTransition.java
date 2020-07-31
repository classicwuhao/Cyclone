package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.Transition;
import org.nuim.cyclone.model.State;
import org.nuim.cyclone.model.SrcInfo;

public class ASTTransition extends ASTExpression{
    private ASTExpression condition;
    private String label;
    private Token src;
    private Token tar;

    public ASTTransition(){
        super();
    }

    public ASTTransition (Token token, String label){
        super(token.getText());
        this.label=label;
    }

    public void setLabel(String label){
        this.label = label;
    }

    public void setExpression(ASTExpression expr){
        this.condition = expr;
    }

    public void setSrc(Token src){
        this.src=src;
    }

    public void setTar(Token tar){
        this.tar=tar;
    }
    public String label(){return this.label;}
    public ASTExpression condition(){return this.condition;}
    

    public Transition gen(ASTContext context) throws SemanticException{
        Transition trans = new Transition(this.name());
        /**
         * We leave a transition to the machine to finish fully construction, we only construct a partial transition here.
         * We only set names for states (States are checked at spec level, not here.).
         * */ 
        trans.setLabel(this.label);
        trans.setSrc(this.src.getText());
        trans.setTar(this.tar.getText());

        /**
         * We need to set up the context for semantically checking where expression.
         * 
         * */ 

        if (this.condition!=null){
            State src_state = context.fetch(trans.src());
            if (src_state==null){
                context.logError(src," no source state "+trans.src()+" can be found.",true);
                throw new SemanticException(src," no source state "+trans.src()+" can be found.");
            }

            State tar_state = context.fetch(trans.tar());

            if (tar_state==null){
                context.logError(tar," no target state "+trans.src()+" can be found.",true);
                throw new SemanticException(tar," no target state "+trans.tar()+" can be found.");
            }

            /* TODO: Before setting up our new context information, we need to remember current information. */ 

            context.setLocalVariables(src_state.localVariables());
            context.set_trans_flag();
            trans.setExpr(this.condition.gen(context));
            context.reset_trans_flag();
        }
       
        return trans;
    }

}