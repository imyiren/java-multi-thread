package com.imyiren.part6.singleton_8;

/**
 * className MyObject
 * description MyObject
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 12:51
 */
public class MyObject {

    private static MyObject instance = null;

    private MyObject() {

    }

    //使用静态代码块来实现单例模式
    static{
        instance = new MyObject();
    }

    public static MyObject getInstance() {
        return instance;
    }
}
