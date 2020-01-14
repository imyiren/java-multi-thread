package com.imyiren.part7.state_test_3;

/**
 * className Run1
 * description Run1
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 13:10
 */
public class Run {
    //NEW,
    // RUNNABLE,
    // TERMINATED,
    // BLOCKED,
    // WAITING,
    // TIMED_WAITING
    public static void main(String[] args) throws InterruptedException {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.setName("A");
        t2.setName("B");
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println("main method t2 state : " + t2.getState());
    }
}
