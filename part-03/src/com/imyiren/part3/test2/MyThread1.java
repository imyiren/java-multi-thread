package com.imyiren.part3.test2;

/**
 * className MyThread1
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午12:05
 */
public class MyThread1 extends Thread {
    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock) {
                System.out.println("begin time = " + System.currentTimeMillis());
                lock.wait();
                System.out.println("  end time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
