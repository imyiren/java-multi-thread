package com.imyiren.part2.syn_more_object_static_one_lock;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午5:03
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 同步锁 多个对象 静态方法  没必要测试这个
         */
        Service service1 = new Service();
        Service service2 = new Service();
        ThreadA aThread = new ThreadA(service1);
        ThreadB bThread = new ThreadB(service2);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();

    }
}
