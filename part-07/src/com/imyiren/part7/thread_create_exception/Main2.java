package com.imyiren.part7.thread_create_exception;

/**
 * className Main2
 * description Main2
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 18:07
 */
public class Main2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("Thread t1");
        t1.setUncaughtExceptionHandler((t,e)->{
            System.out.println(t.getName()+ " >Occur Exception");
            e.printStackTrace();
        });
        t1.start();
        MyThread t2 = new MyThread();
        t2.setName("Thread t2");
        t2.start();
    }
}
