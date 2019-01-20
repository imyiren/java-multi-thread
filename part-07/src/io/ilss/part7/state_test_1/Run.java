package io.ilss.part7.state_test_1;

/**
 * className Run
 * description Run
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 13:10
 */
public class Run {
    //NEW,
    // RUNNABLE,
    // TERMINATED,
    // BLOCKED,
    // WAITING,
    // TIMED_WAITING
    public static void main(String[] args) {
        try {
            MyThread t = new MyThread();
            System.out.println(" 1    Main method state : " + t.getState());
            Thread.sleep(1000);
            t.start();
            Thread.sleep(1000);
            System.out.println(" 2    Main method state : " + t.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
