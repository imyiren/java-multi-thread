package com.imyiren.part4.await_until_test;

/**
 * className Run2
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午9:20
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        MyThreadB myThreadB = new MyThreadB(service);
        myThreadA.start();
        Thread.sleep(2000);
        myThreadB.start();
    }
}
