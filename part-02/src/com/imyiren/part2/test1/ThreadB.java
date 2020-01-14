package com.imyiren.part2.test1;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:23
 */
public class ThreadB extends Thread {
    private Service service;
    private MyObject object;

    public ThreadB(MyObject object, Service service) {
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
