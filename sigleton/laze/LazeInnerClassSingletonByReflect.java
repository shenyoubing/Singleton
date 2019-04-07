package com.syb.sigleton.laze;

//最有效率的懒汉式单例，利用内部类的加载顺序
public class LazeInnerClassSingletonByReflect {

    //避免通过反射破坏单例模式，通过构造方法将反射拦截
    private LazeInnerClassSingletonByReflect(){
        if (lazeHolder.LAZE != null){
            new Exception("不允许访问");
        }
    }

    public static final LazeInnerClassSingletonByReflect getInstance(){

        return lazeHolder.LAZE;
    }
    private static class lazeHolder{
        private static final LazeInnerClassSingletonByReflect LAZE =  new LazeInnerClassSingletonByReflect();;
    }
}
