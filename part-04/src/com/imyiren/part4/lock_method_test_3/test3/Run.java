package com.imyiren.part4.lock_method_test_3.test3;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午7:55
 */
public class Run {
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = service1::serviceMethod;
        Thread thread = new Thread(runnable);
        //isLocked作用是查询此锁定是否由任意线程保持
        thread.start();
    }
}
