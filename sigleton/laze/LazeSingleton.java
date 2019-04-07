package com.syb.sigleton.laze;

//缺点，浪费系统空间，
public class LazeSingleton {

    private static  LazeSingleton lazesingleton = null;

    private LazeSingleton(){}

    public static LazeSingleton getInstance(){
        if(lazesingleton == null){
            lazesingleton = new LazeSingleton();
        }
        return lazesingleton;
    }
}
