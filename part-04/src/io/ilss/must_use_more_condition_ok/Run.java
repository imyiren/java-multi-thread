package io.ilss.must_use_more_condition_ok;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午4:55
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        /**
         * ReentrantLock对象可以唤醒指定种类的线程。
         * 只唤醒A
         */
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
        Thread.sleep(3000);
        service.signalAll_A();
    }
}
