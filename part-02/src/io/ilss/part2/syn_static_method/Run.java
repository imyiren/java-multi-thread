package io.ilss.part2.syn_static_method;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:44
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 类的同步锁
         */
        ThreadA aThread = new ThreadA();
        ThreadB bThread = new ThreadB();
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }
}
