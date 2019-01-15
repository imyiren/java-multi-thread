package io.ilss.part2.synblockmoreobjectonelock;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午5:10
 */
public class Run {
    public static void main(String[] args) {
        /**
         * synchronized(X.class)和X类的synchronized static方法 同步锁实现
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
