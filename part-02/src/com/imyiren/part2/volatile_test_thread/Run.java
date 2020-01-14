package com.imyiren.part2.volatile_test_thread;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午9:30
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] myThreadArray = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreadArray[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThreadArray[i].start();
        }
    }
}
