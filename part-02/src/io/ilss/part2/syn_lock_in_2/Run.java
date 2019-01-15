package io.ilss.part2.syn_lock_in_2;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 上午12:49
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 可重入锁 ：父子传递，可以子类调用父类
         */
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
