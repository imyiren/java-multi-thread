package io.ilss.part6.singleton_5;

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
        //DCL双检查机制 可行  DCL是大多数多线程结合单例模式使用的解决方案。
        t1.start();
        t2.start();
        t3.start();
    }
}
