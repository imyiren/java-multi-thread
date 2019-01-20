package io.ilss.part6.singleton_1;

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
        //延迟加载 懒汉式
        //如果在多线程的环境中 可能会出现取出多个实例的情况。
        MyThread t1 = new MyThread();
        t1.start();
    }
}
