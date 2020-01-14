package com.imyiren.part4.condition_test_many_to_many;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * className MyService
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午5:11
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition conditionB = lock.newCondition();
    private Condition conditionA = lock.newCondition();
    private boolean hasValue = false;
    public void set() {
        try {
            lock.lock();
            while (hasValue) {
                System.out.println("有可能★★连续");
                conditionA.await();
            }
            System.out.println("打印★");
            hasValue = true;
            conditionB.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void get() {
        try {
            lock.lock();
            while (!hasValue) {
                System.out.println("有可能☆☆连续");
                conditionB.await();
            }
            System.out.println("打印☆");
            hasValue = false;
            conditionA.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
