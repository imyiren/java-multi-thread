package io.ilss.part3.join_test_2;

/**
 * className LRUCache
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午8:23
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread threadTest = new MyThread();
        threadTest.start();
        threadTest.join();
        //join是对当前线程无限阻塞，等调用join的线程结束了再执行当前线程。
        System.out.println("The End!");
    }
}
