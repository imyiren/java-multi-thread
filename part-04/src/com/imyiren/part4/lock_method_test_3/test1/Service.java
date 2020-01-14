package com.imyiren.part4.lock_method_test_3.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午7:44
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }
    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("公平锁的情况： " + lock.isFair());
        }finally {
            lock.unlock();
        }
    }
}
