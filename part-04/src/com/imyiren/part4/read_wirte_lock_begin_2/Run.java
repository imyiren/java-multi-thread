package com.imyiren.part4.read_wirte_lock_begin_2;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午9:38
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.setName("A");
        //写写互斥
        b.start();
        a.start();
    }
}
