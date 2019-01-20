package io.ilss.part7.state_test_1;

/**
 * className MyThread
 * description MyThread
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 13:09
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("Constuctor method state : " + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        super.run();
        System.out.println("       Run method state : " + Thread.currentThread().getState());
    }
}
