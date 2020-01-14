package com.imyiren.part2.set_new_string_two_lock;

/**
 * className MyService
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午7:52
 */
public class MyService {
    private String lock = "123";

    public void testMethod() {
        try {
            synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
            lock = "456";
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }
}
