package io.ilss.part3.join_sleep_1;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午8:48
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("b run begin timer = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b run   end timer = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void bService() {
        System.out.println("print b service timer = " + System.currentTimeMillis());
    }
}
