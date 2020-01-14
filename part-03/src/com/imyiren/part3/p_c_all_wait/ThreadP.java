package com.imyiren.part3.p_c_all_wait;


/**
 * className ThreadP
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午10:12
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
            p.setValue();
        }
    }
}
