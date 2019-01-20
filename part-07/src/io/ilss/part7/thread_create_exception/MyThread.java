package io.ilss.part7.thread_create_exception;

/**
 * className MyThread
 * description MyThread
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 18:06
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        String username = null;
        System.out.println(username.hashCode());
    }
}
