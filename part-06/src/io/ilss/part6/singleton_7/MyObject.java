package io.ilss.part6.singleton_7;

/**
 * className MyObject
 * description MyObject
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 12:28
 */

public class MyObject {
    //private static MyObject object;

    private static class MyObjectHandler {
        private static MyObject object = new MyObject();
    }

    public static MyObject getInstance() {
        return MyObjectHandler.object;
    }
}

