package com.imyiren.part2.syn_block_more_object_one_lock;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午5:08
 */
public class Service {
    public static void printA() {
        synchronized (Service.class) {
            try {
                System.out.println("thread name = " + Thread.currentThread().getName() + " in printA at " + System.currentTimeMillis());
                Thread.sleep(3000);
                System.out.println("thread name = " + Thread.currentThread().getName() + " out printA at " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized public static void printB() {
        System.out.println("thread name = " + Thread.currentThread().getName() + " in printB at " + System.currentTimeMillis());
        System.out.println("thread name = " + Thread.currentThread().getName() + " out printB at " + System.currentTimeMillis());
    }
}
