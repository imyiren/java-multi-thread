package com.imyiren.part2.syn_lock_in_1;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 上午12:39
 */
public class Service {
    synchronized public void service1() {
        System.out.println("service 1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service 2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service 3");
    }
}
