package io.ilss.part6.singleton_1;

/**
 * className MyThread
 * description MyThread
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 12:26
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(MyObject.getInstance().hashCode());
    }
}
