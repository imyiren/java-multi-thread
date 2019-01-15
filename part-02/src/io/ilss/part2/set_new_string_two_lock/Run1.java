package io.ilss.part2.set_new_string_two_lock;

/**
 * className Run1
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午7:54
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * A执行的时候改变了lock的值，所以B的锁是"456"，所以AB异步执行了。
         */
        MyService service = new MyService();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        Thread.sleep(50);
        bThread.start();
    }
}
