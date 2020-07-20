package org.nuim.cyclone.model.type;
import java.util.List;
import java.util.ArrayList;

public class EnumType extends NonPrimitiveType {
    private List<String> value = new ArrayList<String>();

    public EnumType(){
        super("enum");
    }

    public void add(String literal){
        this.value.add(literal);
    }
    
    @Override
    public boolean isEnumType(){return true;}

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.name());
        sb.append("{ ");
        for (String literal : this.value)
            sb.append(literal+" ");
        sb.append("}");
        return sb.toString();
    }
}