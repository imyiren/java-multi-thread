package io.ilss.part6.singleton_0;

/**
 * className MyObject
 * description MyObject
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 12:25
 */
public class MyObject {
    //立即加载方式 == 懒汉模式
    private static MyObject object = new MyObject();

    public static MyObject getInstance() {
        return object;
    }
}
