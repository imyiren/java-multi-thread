package io.ilss.use_condition_wait_notify_ok;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * className MyService
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午4:24
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();
    public void await() {
        try {
            lock.lock();
            System.out.println("await time = " + System.currentTimeMillis());
            condition.await();
            System.out.println("after await");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signal() {
        try {
            lock.lock();
            System.out.println("signal time = " + System.currentTimeMillis());
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
