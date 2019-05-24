package io.ilss.part2.syn_not_extends;

/**
 * className LRUCache
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 下午1:15
 */
public class Test {
    public static void main(String[] args) {
        /**
         * synchronized 不具有继承性，如果子类需要同步则需要再加上synchronized修饰。
         */
        Sub subRef = new Sub();
        ThreadA aThread = new ThreadA(subRef);
        ThreadB bThread = new ThreadB(subRef);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }
}
