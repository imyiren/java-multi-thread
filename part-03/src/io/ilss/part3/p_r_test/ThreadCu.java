package io.ilss.part3.p_r_test;

import io.ilss.part3.notify_one.ThreadC;

/**
 * className ThreadCu
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午10:13
 */
public class ThreadCu extends Thread {
    private C c;

    public ThreadCu(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            c.getValue();
        }

    }
}
