package com.imyiren.part3.test2;

/**
 * className MyThread2
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午12:07
 */
public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock) {
            System.out.println("begin notify time " + System.currentTimeMillis());
            lock.notify();
            System.out.println("  end notify time " + System.currentTimeMillis());
        }
    }
}
