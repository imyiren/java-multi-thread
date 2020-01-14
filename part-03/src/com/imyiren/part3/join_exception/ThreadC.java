package com.imyiren.part3.join_exception;

/**
 * className ThreadC
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午8:35
 */
public class ThreadC extends Thread {
    private ThreadB bThread;

    public ThreadC(ThreadB bThread) {
        this.bThread = bThread;
    }

    @Override
    public void run() {
        super.run();
        bThread.interrupt();
    }
}
