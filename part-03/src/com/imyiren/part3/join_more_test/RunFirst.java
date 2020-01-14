package com.imyiren.part3.join_more_test;

/**
 * className RunFirst
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午9:34
 */
public class RunFirst {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println("main end = " + System.currentTimeMillis());
    }
}
