package io.ilss.part3.thread_local_test;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午1:56
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("ThreadB " + (i + 1));
                System.out.println("ThreadB get value = " + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
