package com.syb.sigleton.register;

import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {

    private  ContainerSingleton(){}

    private static Map<String,Object> map = new HashMap<String, Object>();

    public static Object getInstance(String className){
        boolean containsKey = map.containsKey(className);
        if(!containsKey){
            try {
                Object instance = Class.forName(className).newInstance();
                map.put(className,instance);
                return instance;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return map.get(className);
    }


}
