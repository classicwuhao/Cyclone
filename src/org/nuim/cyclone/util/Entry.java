package org.nuim.cyclone.util;

public class Entry<E1,E2> {
    private E1 e1;
    private E2 e2;

    public Entry(E1 e1,E2 e2){
        this.e1=e1;
        this.e2=e2;
    }

    public void setFirst(E1 e1){
        this.e1=e1;
    }
    
    public void setSecond(E2 e2){
        this.e2=e2;
    }

    public E1 first(){return this.e1;}
    public E2 second(){return this.e2;}

    public E2 contains(E1 e1){
        return this.e1.equals(e1) ? this.e2 : null;
    }
    
    public String toString(){
        return "<"+e1.toString()+" : "+e2.toString()+">";
    }
}