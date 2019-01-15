package io.ilss.part2.set_new_string_two_lock;

/**
 * className Run2
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午7:59
 */
public class Run2 {
    public static void main(String[] args) {
        /**
         * 线程AB都持有"123"的锁，虽然将锁改成了"456"，但结果还是同步的，因为A和B共同争抢的锁都是"123"
         * 另外：只要对象不变，即使对象的属性被改变，运行的结果还是同步。
         */
        MyService service = new MyService();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }
}
