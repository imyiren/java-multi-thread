package io.ilss.fair_onfair_test;

import java.io.Serializable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午5:23
 */
public class Service {
    private Lock lock;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("Thread name = " + Thread.currentThread().getName() + " get locked");
        }finally {
            lock.unlock();
        }
    }
}
