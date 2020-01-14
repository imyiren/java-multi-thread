package com.imyiren.part2.t9;

/**
 * className ThreadA
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午3:50
 */
public class ThreadA extends Thread {
    private MyOneList list;

    public ThreadA(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        MyService msRef = new MyService();
        msRef.addServiceMethod(list, "A");
    }
}
