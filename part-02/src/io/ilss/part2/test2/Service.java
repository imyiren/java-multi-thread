package io.ilss.part2.test2;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:32
 */
public class Service {
    public void testMethod1(MyObject object) {
        synchronized (object) {
            try {
                System.out.println("test method 1 __getLock time = " + System.currentTimeMillis() + " run thread name = " + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("test method 1 releaseLock time = " + System.currentTimeMillis() + " run thread name = " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
