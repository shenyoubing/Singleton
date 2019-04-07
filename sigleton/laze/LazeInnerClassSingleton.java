package com.syb.sigleton.laze;

//最有效率的懒汉式单例，利用内部类的加载顺序
public class LazeInnerClassSingleton {

    private LazeInnerClassSingleton(){}

    public static final  LazeInnerClassSingleton getInstance(){

        return lazeHolder.LAZE;
    }
    private static class lazeHolder{
        private static final LazeInnerClassSingleton LAZE =  new LazeInnerClassSingleton();;
    }
}
