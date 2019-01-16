package io.ilss.part3.wait_old;

/**
 * className Substract
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午9:20
 */
public class Substract {
    private String lock;

    public Substract(String lock) {
        this.lock = lock;
    }

    public void substract() {
        try {
            synchronized (lock) {
                while (ValueObject.list.size() == 0) {
                    System.out.println("wait begin Thread name = " + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wati   end Thread name = " + Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("list size = " + ValueObject.list.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
