package io.ilss.part7.state_test_3;

/**
 * className MyThread2
 * description MyThread2
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 13:22
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        MyService.serviceMethod();
    }
}
