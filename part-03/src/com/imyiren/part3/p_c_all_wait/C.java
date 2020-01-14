package com.imyiren.part3.p_c_all_wait;

/**
 * className C
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午10:22
 */
public class C {
    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                Thread.sleep(100);
                while ("".equals(ValueObject.value)) {
                    System.out.println("consumer " + Thread.currentThread().getName() + " waiting ");
                    lock.wait();
                }
                System.out.println("consumer " + Thread.currentThread().getName() + " runnable ");
                System.out.println("get value = " + ValueObject.value);
                ValueObject.value = "";
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
