package com.imyiren.part4.fair_onfair_test;

/**
 * className RunNotFair
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午5:31
 */
public class RunNotFair {
    public static void main(String[] args) {
        final Service service = new Service(false);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("★process " + Thread.currentThread().getName() + "run");
                service.serviceMethod();
            }
        };

        Thread[] threadArray = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }

        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
