package com.imyiren.part3.thread_local_test;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午1:57
 */
public class Run {
    public static void main(String[] args) {
        try {
            /**
             * 每个线程只取出自己的数据
             */
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("Main " + (i + 1));
                System.out.println("Main get value = " + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
