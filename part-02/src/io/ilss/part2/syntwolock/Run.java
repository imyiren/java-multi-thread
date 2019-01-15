package io.ilss.part2.syntwolock;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:52
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 对象锁 和 类锁 引起 C是异步运行的
         */
        Service service = new Service();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        ThreadC cThread = new ThreadC(service);
        aThread.setName("A");
        bThread.setName("B");
        cThread.setName("C");
        aThread.start();
        bThread.start();
        cThread.start();

    }
}
