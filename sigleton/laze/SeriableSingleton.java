package com.syb.sigleton.laze;


public class SeriableSingleton {

    private static SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){

        return seriableSingleton;
    }

    /**
     * 重写readResolve方法，且不过是覆盖了反序列化出来的对象
     * 还是创建了两次，发生在JVM层面，相对来说比较安全
     * 之前反序列化出来的对象会被GC回收
     * @return
     */
    public Object readResolve(){
        return seriableSingleton;
    }

}
