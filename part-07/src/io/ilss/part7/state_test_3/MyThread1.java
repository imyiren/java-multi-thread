package io.ilss.part7.state_test_3;

/**
 * className MyThread1
 * description MyThread1
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 13:22
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        super.run();
        MyService.serviceMethod();
    }
}
