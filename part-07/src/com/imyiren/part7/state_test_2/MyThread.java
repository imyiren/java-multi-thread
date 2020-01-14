package com.imyiren.part7.state_test_2;

/**
 * className MyThread
 * description MyThread
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 13:18
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("begin sleep");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("  end sleep");

    }
}