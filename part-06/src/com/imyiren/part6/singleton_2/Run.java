package com.imyiren.part6.singleton_2;

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
        //打印出的hashcode不一样，说明这个单例模式是错误的。
        t1.start();
        t2.start();
        t3.start();
    }
}
