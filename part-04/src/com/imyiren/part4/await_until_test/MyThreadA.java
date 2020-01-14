package com.imyiren.part4.await_until_test;

/**
 * className MyThreadA
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午9:19
 */
public class MyThreadA extends Thread {
    private Service service;

    public MyThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }

}
