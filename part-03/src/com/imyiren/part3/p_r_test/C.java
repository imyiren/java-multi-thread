package com.imyiren.part3.p_r_test;

/**
 * className C
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午10:10
 */
public class C {
    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if ("".equals(ValueObject.value)) {
                    lock.wait();
                }
                System.out.println("get value = " + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
