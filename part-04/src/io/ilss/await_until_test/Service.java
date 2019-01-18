package io.ilss.await_until_test;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午9:20
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out
                    .println("wait begin timer=" + System.currentTimeMillis());
            condition.awaitUntil(calendarRef.getTime());
            System.out
                    .println("wait   end timer=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void notifyMethod() {
        try {
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out
                    .println("notify begin timer=" + System.currentTimeMillis());
            condition.signalAll();
            System.out
                    .println("notify   end timer=" + System.currentTimeMillis());
        } finally {
            lock.unlock();
        }

    }
}
