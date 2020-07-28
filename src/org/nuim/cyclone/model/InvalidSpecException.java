package org.nuim.cyclone.model;

public class InvalidSpecException extends Exception{
    private static final long serialVersionUID = 4L;
    private SrcInfo info;
    private final String head = "Invalid Spec Error:";

    public InvalidSpecException(String message){
        super(message);
    }

    public InvalidSpecException(SrcInfo info, String message){
        super(message);
        this.info=info;
    }

    public String source(){
        return 
            (this.info==null) ? "" : 
            this.info.name()+" line - "+this.info.line()+" : "+this.info.column();
    }

    @Override
    public String getMessage(){
        StringBuffer sb = new StringBuffer();
        sb.append(head);
        if (this.info!=null) sb.append(this.info);
        sb.append(super.getMessage());
        return sb.toString();
    }

}