package com.imyiren.part2.atomic_integer_test;


/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午9:51
 */
public class Run {
    public static void main(String[] args) {
        /**
         * i++除了synchronized关键字实现同步以外，使用原子类AtomicInteger原子类也可以进行实现。
         */
        AddCountThread countService = new AddCountThread();
        Thread[] thread = new Thread[5];
        for (int i = 0; i < 5; i++) {
            thread[i] = new Thread(countService);
        }
        for (int i = 0; i < 5; i++) {
            thread[i].start();
        }
    }
}
