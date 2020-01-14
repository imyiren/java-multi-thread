package com.imyiren.part3.join_long;

/**
 * className LRUCache
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午8:41
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            thread.join(2000);
            System.out.println("End timer = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
