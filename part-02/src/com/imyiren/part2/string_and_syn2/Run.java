package com.imyiren.part2.string_and_syn2;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午5:26
 */
public class Run {
    public static void main(String[] args) {
        /**]
         * 因为java的JVM中存在String常量池缓存的功能，所以传入"AA" 两个线程持有相同的锁
         * 造成B不能执行，这就是String常量池带来的问题。
         * 同步synchronized代码块都不使用String作为锁对象改用其他，
         * 比如new Object()实例化一个Object对象，但它并不放入缓存中。
         * 这个例子就是使用Object对象的
         */
        ThreadA aThread = new ThreadA();
        ThreadB bThread = new ThreadB();
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }
}
