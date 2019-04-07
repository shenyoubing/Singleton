package com.syb.sigleton.hungry;

public class HungryStaticSingleton {

    private static  final HungryStaticSingleton hungrysingleton ;

    static {
        hungrysingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return hungrysingleton;
    }
}
