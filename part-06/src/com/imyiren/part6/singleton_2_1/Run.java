package com.imyiren.part6.singleton_2_1;

/**
 * className Run
 * description Run
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 12:26
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        //解决方案，用synchronized加同步锁。保证一个时间内只有一个线程加载。
        t1.start();
        t2.start();
        t3.start();
    }
}
