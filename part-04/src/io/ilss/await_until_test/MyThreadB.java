package io.ilss.await_until_test;

/**
 * className MyThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午9:19
 */
public class MyThreadB extends Thread {
    private Service service;

    public MyThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
