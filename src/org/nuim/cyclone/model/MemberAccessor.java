package org.nuim.cyclone.model;
import org.nuim.cyclone.model.SrcInfo;
import org.nuim.cyclone.model.type.Type;

public class MemberAccessor extends Expression {

    private IdentExpr source;
    private IdentExpr member;

    public MemberAccessor(IdentExpr source, IdentExpr member, SrcInfo info){
        super(info);
        this.source=source;
        this.member=member;
    }

    public IdentExpr source(){
        return this.source;
    }

    public IdentExpr member(){
        return this.member;
    }

    public void setSource(IdentExpr source){
        this.source=source;
    }

    public void setMember(IdentExpr member){
        this.member=member;
    }

    @Override
    public Type type(){return this.member.type();}

    @Override 
    public String toString(){
        return this.source + "."+this.member;
    }

}