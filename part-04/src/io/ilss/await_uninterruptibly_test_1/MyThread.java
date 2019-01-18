package io.ilss.await_uninterruptibly_test_1;

/**
 * className MyThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午9:15
 */
public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
