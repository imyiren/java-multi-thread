package com.imyiren.part2.test3;

/**
 * className MyObject
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:36
 */
public class MyObject {
    public void speedPrintString() {
        synchronized (this) {
            System.out.println("speedPrintString __getLock time = " + System.currentTimeMillis() + " Run thread name " + Thread.currentThread().getName());
            System.out.println("------------------------------------------------");
            System.out.println("speedPrintString releaseLock time = " + System.currentTimeMillis() + " Run thread name " + Thread.currentThread().getName());
        }

    }
}
