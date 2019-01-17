package io.ilss.part3.join_more_test;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午9:12
 */
public class ThreadB extends Thread {
    @Override
    synchronized public void run() {
        super.run();
        try {
            System.out.println("begin B thread name = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  end B thread name = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
