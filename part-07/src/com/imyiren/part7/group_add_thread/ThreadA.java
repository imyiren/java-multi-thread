package com.imyiren.part7.group_add_thread;

/**
 * className ThreadA
 * description ThreadA
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 15:20
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread name : " + Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
