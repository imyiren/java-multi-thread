package io.ilss.part7.thread_group_2;

/**
 * className Run
 * description Run
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 19:16
 */
public class Run {
    public static void main(String[] args) {
        MyThreadGroup group = new MyThreadGroup("My Thread Group!");
        MyThread[] myThread = new MyThread[10];
        for (int i = 0; i < myThread.length; i++) {
            myThread[i] = new MyThread(group, "Thread " + (i + 1), "1");
            myThread[i].start();
        }
        MyThread t = new MyThread(group, "Exception Thread ", "AA");
        t.start();

    }
}
