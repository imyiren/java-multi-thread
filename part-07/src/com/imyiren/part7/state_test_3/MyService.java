package com.imyiren.part7.state_test_3;

/**
 * className MyService
 * description MyService
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 13:21
 */
public class MyService {
    synchronized static public void serviceMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + " come in service method!");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
