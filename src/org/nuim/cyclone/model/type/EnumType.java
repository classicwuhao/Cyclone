package org.nuim.cyclone.model.type;

public class EnumType extends Type {
        public EnumType(){
            super("enum");
        }

        @Override
        public boolean isEnumType(){return true;}
}