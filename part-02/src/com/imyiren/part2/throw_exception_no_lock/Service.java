package com.imyiren.part2.throw_exception_no_lock;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 下午12:56
 */
public class Service {
    synchronized public void testMethod() {
        if ("a".equals(Thread.currentThread().getName())) {
            System.out.println("Thread name = " + Thread.currentThread().getName() + " Run begin time = " + System.currentTimeMillis());
            while (true) {
                if ("0.123456".equals(("" + Math.random()).substring(0, 8))) {
                    System.out.println("Thread name = " + Thread.currentThread().getName() + " Run exception = " + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("Thread B Run time = " + System.currentTimeMillis());
        }
    }
}
