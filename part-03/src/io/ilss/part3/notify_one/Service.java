package io.ilss.part3.notify_one;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午6:44
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() thread name " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("  end wait() thread name " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
