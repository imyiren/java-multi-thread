package io.ilss.await_uninterruptibly_test_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午9:14
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void testMethod() {
        try {
            lock.lock();
            System.out.println("wait begin");
            condition.await();
            System.out.println("wait   end");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("catch");
        } finally {
            lock.unlock();
        }

    }
}
