package com.imyiren.part7.thread_exception_move;

/**
 * className Run1
 * description Run1
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 19:23
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();

    }
}
