package com.imyiren.part3.thread_local_1;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午1:18
 */
public class Run {
    public static ThreadLocal<String> t1 = new ThreadLocal<>();

    public static void main(String[] args) {
        if (t1.get() == null) {
            System.out.println("t1 is null");
            t1.set("t1 value");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());

    }
}
