package com.syb.sigleton.laze;


public class LazeCheckSingleton {

    private static LazeCheckSingleton lazesingleton = null;

    private LazeCheckSingleton(){}

    public static LazeCheckSingleton getInstance(){
        if(lazesingleton == null){
            synchronized (LazeCheckSingleton.class){
                if (lazesingleton == null){
                    lazesingleton = new LazeCheckSingleton();
                }
            }
        }
        return lazesingleton;
    }
}
