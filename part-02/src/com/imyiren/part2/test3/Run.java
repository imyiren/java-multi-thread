package com.imyiren.part2.test3;


/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:34
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA aThread = new ThreadA(object, service);
        ThreadB bThread = new ThreadB(object);
        aThread.setName("a");
        bThread.setName("b");
        aThread.start();
        bThread.start();
    }
}
