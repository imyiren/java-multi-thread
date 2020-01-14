package com.imyiren.part7.state_test_4;

/**
 * className MyThread
 * description MyThread
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 13:26
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            synchronized (Lock.lock) {
                Lock.lock.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
