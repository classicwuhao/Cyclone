package org.nuim.cyclone.util;

public class BitVector {
    private boolean[] vector;
    private int size;

    public BitVector(int size){
        this(size,false);
    }

    public BitVector(int value, boolean flag){
        if (!flag) {
            vector = new boolean[size];
            this.size = value;
            return;
        }
        String str = String.valueOf(value);
        vector = new boolean[str.length()];
        for (int i=0;i<str.length();i++)
            vector[i]= (str.charAt(i)=='0') ? false : true;
        
        this.size = str.length();
    }

    public void set(int value, int index){
        vector[index] = (value!=0) ? true : false;
    }

    public int get (int index){
        return (vector[index]==true) ? 1 : 0;
    }

    private char getChar(int index){
        return (vector[index]==true) ? '1' : '0';
    }

    public int size(){return this.size;}

    public boolean equals(int value){
        String str = String.valueOf(value);
        if (str.length()<this.size()){
            pad0s(str,diff(str.length(),this.size()));
        }
        else {
            return false;
        }
        
        for (int i=0;i<this.size();i++)
            if (str.charAt(i)!=this.getChar(i)) return false;

        return true;
    }

    public BitVector and(BitVector vector){
        int max = max(vector.size(),this.size());
        int min = min(vector.size(),this.size());

        BitVector v = new BitVector(max);
        int i=0;
        for (;i<min;i++) v.set(i,this.get(i) & vector.get(i));
        for (int j=i;j<max;j++) v.set(j,0);
        
        return v;
    }

    public BitVector or(BitVector vector){
        int max = max(vector.size(),this.size());
        int min = min(vector.size(),this.size());

        BitVector v = new BitVector(max);
        int i=0;
        for (;i<min;i++) v.set(i,this.get(i) | vector.get(i));
        for (int j=i;j<max;j++) v.set(j,0);
        
        return v;
    }

    public BitVector flip(){
        BitVector v = new BitVector(this.size());
        for (int i=0;i<this.size();i++){
            v.set(i,  this.get(i)==0 ? 1 : 0) ;
        }

        return v;
    }

    private String pad0s(String str, int k){
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<k;i++) sb.append("0");

        return sb.toString()+str;
    }

    private int diff(int x, int y){
        return x > y ? x-y : y-x;
    }

    private int max(int x , int y){
        return x > y ? x :y;
    }

    private int min(int x , int y){
        return x > y ? y : x;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<this.size();i++)
            sb.append(this.get(i));

        return sb.toString();
    }

}