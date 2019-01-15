package io.ilss.part2.synchronized_one_thread_in;

/**
 * className ObjectService
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 下午1:39
 */
public class ObjectService {
    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println("begin time = " + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end   time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
