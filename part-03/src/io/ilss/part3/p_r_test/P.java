package io.ilss.part3.p_r_test;

/**
 * className P
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午10:05
 */
public class P {
    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set value = " + value);
                ValueObject.value = value;
                Thread.sleep(1000);
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
