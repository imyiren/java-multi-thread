package io.ilss.part7.state_test_4;

/**
 * className Run
 * description Run
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 13:27
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread t1 = new MyThread();
            t1.start();
            Thread.sleep(1000);
            System.out.println("Main method t state : " + t1.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
