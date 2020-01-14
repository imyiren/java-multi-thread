package com.imyiren.part4.condition_test_more_method;

/**
 * className ThreadBB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午3:07
 */
public class ThreadBB extends Thread {
    private MyService service;

    public ThreadBB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodB();
    }
}
