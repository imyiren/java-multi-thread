package io.ilss.part2.throwexceptionnolock;

import sun.jvm.hotspot.debugger.ThreadContext;

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
            System.out.println("Thread name = " + Thread.currentThread().getName() + " run begin time = " + System.currentTimeMillis());
            while (true) {
                if ("0.123456".equals(("" + Math.random()).substring(0, 8))) {
                    System.out.println("Thread name = " + Thread.currentThread().getName() + " run exception = " + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("Thread B run time = " + System.currentTimeMillis());
        }
    }
}
