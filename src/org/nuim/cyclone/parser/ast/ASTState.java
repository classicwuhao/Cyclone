package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.State;
import org.nuim.cyclone.model.Variable;
import org.nuim.cyclone.model.SrcInfo;
import org.antlr.runtime.Token ;
import org.nuim.cyclone.model.Expression;
import org.nuim.cyclone.util.BitVector;
import org.nuim.cyclone.model.InvalidSpecException;
import java.util.List;
import java.util.ArrayList;

public class ASTState extends ASTExpression{
    private Token token;
    private BitVector vector = new BitVector(4,false); // 4 bits for our modifier.
    private List<ASTExpression> exprs = new ArrayList<ASTExpression>();
    private List<ASTVariable> variables = new ArrayList<ASTVariable>();

    public ASTState(){
        super();
    }

    public ASTState(String name){
        super(name);
    }

    public void setModifier(ASTStateModifier modifier) throws SemanticException{
        switch (modifier){
            case  START:
            if (vector.get(0)==1)
                throw new SemanticException(token," is already defined as start state.");
            else
                vector.set(0,1);
            break;

            case FINAL:
            if (vector.get(3)==1)
                throw new SemanticException(token," is already defined as final state.");
            else
                vector.set(3,1);
            break;
            
            case NORMAL:
            if (vector.get(1)==1)
                throw new SemanticException(token," is already defined as normal state.");
            else
                vector.set(1,1);
            break;

            case ABSTRACT:
            if (vector.get(2)==1)
                throw new SemanticException(token," is already defined as abstract state.");
            else
                vector.set(2,1);
            break;
        }
    }
    
    public boolean isModifierSet(){return !vector.equals(0);}

    public void addExpr(ASTExpression expr){
        this.exprs.add(expr);
    }

    public void addVar(ASTVariable var){
        variables.add(var);
    }

    public Token token(){return this.token;}
    public void setToken(Token token){this.token=token;}

    public ASTExpression[] exprs(){
        ASTExpression [] exprs = new ASTExpression[this.exprs.size()];
        return this.exprs.toArray(exprs);
    }

    public State gen(ASTContext context) throws SemanticException{
        State state = new State(new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()));
        state.setName(this.token.getText());

        try{
            state.setModifier(this.vector);
        }
        catch (InvalidSpecException e){
            System.err.println(e.getMessage());
        }
        
        for (ASTVariable astvar: variables){
            Variable var = astvar.gen(context);
            state.addVariable(var);
        }

        context.setState(state.name());
        context.setLocalVariables(state.localVariables());
        /* set this flag to allow state accessor to be used in our expressions. */ 
        context.set_trans_flag();
        for (ASTExpression expr:this.exprs){
            Expression e = expr.gen(context);
            state.addExpression(e);
        }
        context.reset_trans_flag();
        /* reset the flag */ 

        if (state.isAbstract() && (state.size_of_variables()!=0 || state.size_of_exprs()!=0)){
            context.out().println("Warnning: state "+ state.name() + " is abstract, its local variables and expressions are ignored.");
            context.out().flush();
            state.clearAll();
        }

        state.setSrcInfo(new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()));
        context.setState("");
        return state;
    }

}