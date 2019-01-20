package io.ilss.part6.singleton_7;

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
        //使用静态内置类来实现单例模式。
        t1.start();
        t2.start();
        t3.start();
    }
}
