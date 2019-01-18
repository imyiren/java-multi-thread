package io.ilss.must_use_more_condition_error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * className MyService
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午4:37
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();
    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA time = " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
            condition.await();
            System.out.println("  end awaitA time = " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB time = " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
            condition.await();
            System.out.println("  end awaitA time = " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll() {
        try {
            lock.lock();
            System.out.println("signalAll time = " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
