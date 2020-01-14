package com.imyiren.part3.stack_1;

/**
 * className ThreadP
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午6:20
 */
public class ThreadP extends Thread {
    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            p.pushService();
        }
    }
}
