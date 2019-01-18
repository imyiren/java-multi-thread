package io.ilss.condition_test_more_method;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * className MyService
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午3:00
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void methodA() {
        try {
            lock.lock();
            System.out.println("method A begin Thread name = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("method A   end Thread name = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void methodB() {
        try {
            lock.lock();
            System.out.println("method B begin Thread name = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("method B   end Thread name = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
