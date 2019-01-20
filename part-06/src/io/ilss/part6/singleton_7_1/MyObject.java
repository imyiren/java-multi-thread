package io.ilss.part6.singleton_7_1;

import java.io.Serializable;

/**
 * className MyObject
 * description MyObject
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 12:28
 */

public class MyObject implements Serializable {
    private static MyObject object;

    private static class MyObjectHandler {
        private static MyObject object = new MyObject();
    }

    public static MyObject getInstance() {
        return MyObjectHandler.object;
    }

    //在反序列化中使用readResolve方法 解决序列化问题。
    protected Object readResolve() {
        System.out.println("call readResolve method");
        return MyObjectHandler.object;
    }
}

