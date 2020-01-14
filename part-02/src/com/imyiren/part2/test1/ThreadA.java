package com.imyiren.part2.test1;

/**
 * className ThreadA
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:22
 */
public class ThreadA extends Thread {
    private MyObject object;
    private Service service;

    public ThreadA(MyObject object, Service service) {
        this.object = object;
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
