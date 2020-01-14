package com.imyiren.part3.thread_local_22;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午2:14
 */
public class Run {
    public static ThreadLocalExt t1 = new ThreadLocalExt();

    public static void main(String[] args) {
        //之类重写了initial方法，可以避免默认为null的情况。
        if (t1.get() == null) {
            System.out.println("null");
            t1.set("my value");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
