package io.ilss.part7.state_test_2;

/**
 * className Run
 * description Run
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

        MyThread t = new MyThread();
        t.start();
        Thread.sleep(1000);
        System.out.println("Main1 method state : " + t.getState());

    }
}
