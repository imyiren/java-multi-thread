package com.imyiren.part3.notify_one;

/**
 * className NotifyThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午6:46
 */
public class NotifyThread extends Thread {
    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock) {
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();

            //lock.notifyAll();
        }
    }
}
