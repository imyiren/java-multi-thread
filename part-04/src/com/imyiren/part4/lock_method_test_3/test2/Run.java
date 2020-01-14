package com.imyiren.part4.lock_method_test_3.test2;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午7:51
 */
public class Run {
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = service1::serviceMethod;
        Thread thread = new Thread(runnable);
        //isHeldByCurrentThread是查看当前线程是否保持此锁定。
        thread.start();
    }
}
