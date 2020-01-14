package com.imyiren.part7.thread_group_1;

/**
 * className Run1
 * description Run1
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 19:00
 */
public class Run {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("My thread group");
        MyThread[] myThread = new MyThread[10];
        for (int i = 0; i < myThread.length; i++) {
            myThread[i] = new MyThread(group, "Thread " + (i + 1), "1");
            myThread[i].start();
        }
        MyThread newT = new MyThread(group, "Exception Thread", "a1");
        newT.start();
    }
}
