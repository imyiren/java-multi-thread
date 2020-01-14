package com.imyiren.part3.stack_2_new;

/**
 * className ThreadC
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午6:21
 */
public class ThreadC extends Thread {
    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            c.popService();
        }
    }
}
