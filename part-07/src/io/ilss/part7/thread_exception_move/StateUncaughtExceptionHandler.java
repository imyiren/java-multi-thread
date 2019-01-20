package io.ilss.part7.thread_exception_move;

/**
 * className StateUncaughtExceptionHandler
 * description StateUncaughtExceptionHandler
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 19:22
 */
public class StateUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("static exception handle！");
        e.printStackTrace();
    }
}
