package io.ilss.part3.two_thread_trans_data;

/**
 * className LRUCache
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 上午11:17
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 由此，虽然线程之间实现了通信，但是B线程不断通过while轮询机制来检测某一个条件，这样会浪费CPU资源。
         */
        MyList service = new MyList();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        aThread.setName("A");
        bThread.setName("B");
        bThread.start();
        aThread.start();
    }
}
