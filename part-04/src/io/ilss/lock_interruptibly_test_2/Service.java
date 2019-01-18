package io.ilss.lock_interruptibly_test_2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午8:47
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod(){
        try {
            lock.lockInterruptibly();
            System.out.println("lock begin " + Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
                String newString = "";
                Math.random();
            }
            System.out.println("lock   end " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
