package com.imyiren.part3.thread_local_test;

/**
 * className ThreadA
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午1:54
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("ThreadA " + (i + 1));
                System.out.println("ThreadA get value = " + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
