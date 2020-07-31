package org.nuim.cyclone.model;
import org.nuim.cyclone.model.type.Type;

public abstract class Expression extends NamedElement {
    private Type type;
    private static ErrorLog errlog;
    private SrcInfo info;

    public Expression(){super();}
    
    public Expression(SrcInfo info){
        this.info=info;
    }

    public Expression(String name, SrcInfo info){
        super(name);
        this.info = info;
    }

    public Expression(String name){
        super(name);
    }

    public Expression(String name, Type type){
        super(name);
        this.type=type;
    }

    public Expression(Type type){
        super("");
        this.type=type;
    }

    public Expression(String name, Type type, SrcInfo info){
        super(name);
        this.type=type;
        this.info=info;
    }

    public Type type(){return this.type;}
    public void setType(Type type){this.type=type;}
    public void setLog(ErrorLog log){errlog=log;}
    public void setSrcInfo(SrcInfo info){this.info=info;}
    public SrcInfo info(){return this.info;}
    public boolean isState(){return false;}
    public boolean isTransition(){return false;}
    public boolean isMachine(){return false;}
    public boolean isAssignmentExpr(){return false;}
    public boolean isIdentExpr(){return true;}
    
    public static void logErrors(String ErrorType, String Message){
        errlog.logErrors(1);
    }
    public static void logErrors(SrcInfo info, String message){
        errlog.logErrors(info, message);
    }
    public ErrorLog errorLog(){return errlog;}
}