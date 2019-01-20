package io.ilss.part6.singleton_5;

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
            //使用DCL双检查机制累实现多线程环境中的延迟加载单例模式设计。
            synchronized (MyObject.class) {
                if (null == object) {
                    object = new MyObject();
                }
            }
        }
        return object;
    }
}

