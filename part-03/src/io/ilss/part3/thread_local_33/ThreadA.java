package io.ilss.part3.thread_local_33;

/**
 * className ThreadA
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午2:20
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadA process value = " + Tools.t1.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
