package com.imyiren.part3.p_c_all_wait;

/**
 * className P
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午10:22
 */
public class P {
    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                Thread.sleep(100);
                while (!ValueObject.value.equals("")) {
                    System.out.println("provider " + Thread.currentThread().getName() + " waiting ");
                    lock.wait();
                }
                System.out.println("provider " + Thread.currentThread().getName() + " runnable ");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set value = " + value);
                ValueObject.value = value;
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
