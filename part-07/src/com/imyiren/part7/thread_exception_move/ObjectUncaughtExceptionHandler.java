package com.imyiren.part7.thread_exception_move;

/**
 * className ObjectUncaughtExceptionHandler
 * description ObjectUncaughtExceptionHandler
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 19:21
 */
public class ObjectUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t.getName() + " Object Exception handle");
        e.printStackTrace();
    }
}
