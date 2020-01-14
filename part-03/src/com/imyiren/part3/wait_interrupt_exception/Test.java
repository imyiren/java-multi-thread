package com.imyiren.part3.wait_interrupt_exception;

/**
 * className LRUCache
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午6:39
 */
public class Test {
    public static void main(String[] args) {
        try {
            /**
             * 当一个wait的线程调用interrupt方法会出现InterruptedException
             */
            Object lock = new Object();
            ThreadA aThread = new ThreadA(lock);
            aThread.start();
            Thread.sleep(5000);
            aThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
