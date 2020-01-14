package com.imyiren.part6.singleton_3;

/**
 * className MyObject
 * description MyObject
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 12:28
 */

public class MyObject {

    private static MyObject object;

    public static MyObject getInstance() {
        if (null == object) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (MyObject.class) {
                object = new MyObject();
            }
        }
        return object;
    }
}

