package com.imyiren.part2.syn_static_method;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:39
 */
public class Service {
    synchronized public static void printA() {
        try {
            System.out.println("thread name = " + Thread.currentThread().getName() + "in printA at " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("thread name = " + Thread.currentThread().getName() + "out printA at " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public static void printB() {
        System.out.println("thread name = " + Thread.currentThread().getName() + "in printB at " + System.currentTimeMillis());
        System.out.println("thread name = " + Thread.currentThread().getName() + "out printB at " + System.currentTimeMillis());
    }
}
