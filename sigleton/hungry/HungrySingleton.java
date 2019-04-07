package com.syb.sigleton.hungry;
//缺点，浪费系统空间，
public class HungrySingleton {

    private static  final HungrySingleton hungrysingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrysingleton;
    }
}
