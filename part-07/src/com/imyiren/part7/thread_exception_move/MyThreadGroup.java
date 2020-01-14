package com.imyiren.part7.thread_exception_move;

/**
 * className MyThreadGroup
 * description MyThreadGroup
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 19:11
 */
public class MyThreadGroup extends ThreadGroup {

    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.println("Thread group exception handle!");
        e.printStackTrace();
        this.interrupt();
    }
}
