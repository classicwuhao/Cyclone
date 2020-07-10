package org.nuim.cyclone.model.value;
import org.nuim.cyclone.model.type.EnumType;
import java.util.List;
import java.util.ArrayList;

public class EnumValue extends Value {
    private List<String> value = new ArrayList<String>();

    public EnumValue(){
        super(new EnumType());
    }

    public void add(String literal){
        this.value.add(literal);
    }

    public List<String> value(){return this.value;}
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("{ ");
        for (String literal : this.value)
            sb.append(literal+" ");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean isEnumValue(){return true;}
}