package io.ilss.part3.notify_one;

/**
 * className LRUCache
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午6:47
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 一个notify仅随机唤醒一个线程
         *
         * notify调用多少次就唤醒多少对应wait的线程，多的自动忽略
         *
         * 唤醒所有  直接notifyAll()
         */
        Object lock = new Object();
        ThreadA aThread = new ThreadA(lock);
        ThreadB bThread = new ThreadB(lock);
        ThreadC cThread = new ThreadC(lock);
        NotifyThread notifyThread = new NotifyThread(lock);
        aThread.start();
        bThread.start();
        cThread.start();
        Thread.sleep(1000);
        notifyThread.start();
    }
}
