package com.imyiren.part4.must_use_more_condition_error;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午4:45
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        /**
         * A B 线程 都会被唤醒
         */
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
        Thread.sleep(3000);
        service.signalAll();
    }
}
