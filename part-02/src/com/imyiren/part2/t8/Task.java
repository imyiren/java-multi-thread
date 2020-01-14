package com.imyiren.part2.t8;

/**
 * className Task
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午1:05
 */
public class Task {
    synchronized public void otherMethod() {
            System.out.println("-----------------------------------Run other method !");
    }
    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized thread name = " + Thread.currentThread().getName() + " i = " + (i + 1));
            }
        }
    }
}
