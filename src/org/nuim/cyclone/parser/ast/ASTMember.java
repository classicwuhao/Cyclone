package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.SrcInfo;
import org.nuim.cyclone.model.MemberAccessor;
import org.nuim.cyclone.model.IdentExpr;
import org.nuim.cyclone.model.Variable;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.type.VoidType;

public class ASTMember extends ASTExpression {
    private Token token;
    private ASTIdentifier source;
    private ASTIdentifier member;
    
    public ASTMember (Token token, ASTIdentifier source, ASTIdentifier member){
        super();
        this.source=source;
        this.member=member;
        this.token=token;
    }

    public ASTIdentifier source(){return this.source;}
    public ASTIdentifier member(){return this.member;}
    public Token token(){return this.token;}

    public void setSource(ASTIdentifier source){
        this.source = source;
    }

    public void setMember(ASTIdentifier member){
        this.member = member;
    }

    public MemberAccessor gen(ASTContext context) throws SemanticException{
        if (this.source.previous()){
            context.logError(token," prev cannot be applied to a state accessor.",true);
            throw new SemanticException(token," prev cannot be applied to a state accessor.");
        }

        if (this.member.previous()){
            context.logError(token," prev cannot be applied to a state member.",true);
            throw new SemanticException(token," prev cannot be applied to a state member.");
        }

        IdentExpr e1= this.source.gen(context);
        IdentExpr e2= this.member.gen(context);

        Variable var = context.local_variables().lookup(e2.name());

        if (var==null){
            //e2.setType(new VoidType());
            context.logError(token, " variable "+e2.name()+" cannot be found in state "+e1.name(),true);
            throw new SemanticException(token, " variable "+e2.name()+" cannot be found in state "+e1.name());
        }

        e2.setType(var.type());
        MemberAccessor member=new MemberAccessor(e1, e2, new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()));
        
        return member;
    }

}