package com.imyiren.part3.wait_release_lock;

/**
 * className LRUCache
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午6:16
 */
public class Test {
    public static void main(String[] args) {
        /**
         * wait方法释放锁，两个都会执行。但是wait后的代码不会被执行。
         */
        Object lock = new Object();
        ThreadA aThread = new ThreadA(lock);
        ThreadB bThread = new ThreadB(lock);
        aThread.start();
        bThread.start();
    }
}
