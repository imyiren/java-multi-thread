package io.ilss.part7.group_inner_stop;

/**
 * className MyThread
 * description MyThread
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 16:27
 */
public class MyThread extends Thread {
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Thread name : " + Thread.currentThread().getName() + " , prepared to endless loop");
        while (!this.isInterrupted()) {
        }
        System.out.println("Thread name : " + Thread.currentThread().getName() + " , End!");
    }

}
