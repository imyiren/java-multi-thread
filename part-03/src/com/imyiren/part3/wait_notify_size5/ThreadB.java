package com.imyiren.part3.wait_notify_size5;

/**
 * className NotifyThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午5:31
 */
public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                MyList.add();
                if (MyList.size() == 5) {
                    lock.notify();
                    System.out.println("notify sent!");
                }
                System.out.println("add " + (i + 1));
            }
        }
    }
}
