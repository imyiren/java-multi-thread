package com.imyiren.part4.condition_test_more_method;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午3:07
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        ThreadAA aa = new ThreadAA(service);
        ThreadB b = new ThreadB(service);
        ThreadBB bb = new ThreadBB(service);
        a.setName("A");
        aa.setName("AA");
        b.setName("B");
        bb.setName("BB");
        a.start();
        aa.start();
        Thread.sleep(100);
        b.start();
        bb.start();
    }
}
