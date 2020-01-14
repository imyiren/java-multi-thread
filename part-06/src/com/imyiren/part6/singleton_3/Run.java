package com.imyiren.part6.singleton_3;

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
        //遇到多线程同样会出现问题。
        t1.start();
        t2.start();
        t3.start();
    }
}
