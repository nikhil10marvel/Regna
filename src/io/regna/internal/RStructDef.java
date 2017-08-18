package io.regna.internal;

import java.io.Serializable;
import java.util.HashMap;

public class RStructDef implements Serializable{

    protected HashMap<String, String> complete_register = new HashMap<>();
    protected String name;

    public RStructDef(String name){
        this.name = name;
    }

    public void registerInt(String name){
        complete_register.put("int", name);
    }

    public void registerFloat(String name){
        complete_register.put("float", name);
    }

    public void registerDouble(String name){
        complete_register.put("double", name);
    }

    public void registerObject(String name, String type) {
        complete_register.put(name, type);
    }

    //public void setValue(String name, Object object){
      //  values.put(name, object);
    //}

}
