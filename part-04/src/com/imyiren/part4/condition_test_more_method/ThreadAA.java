package com.imyiren.part4.condition_test_more_method;

/**
 * className ThreadAA
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午3:06
 */
public class ThreadAA extends Thread {
    private MyService service;

    public ThreadAA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
