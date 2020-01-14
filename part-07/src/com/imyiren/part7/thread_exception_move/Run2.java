package com.imyiren.part7.thread_exception_move;

/**
 * className Run2
 * description Run2
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 19:25
 */
public class Run2 {
    public static void main(String[] args) {
        MyThreadGroup group = new MyThreadGroup("My Thread Group");
        MyThread myThread = new MyThread(group, "My Thread");
        //myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        //MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }
}
