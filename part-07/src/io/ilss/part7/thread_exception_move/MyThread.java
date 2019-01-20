package io.ilss.part7.thread_exception_move;

/**
 * className MyThread
 * description MyThread
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 18:59
 */
public class MyThread extends Thread {
    private String num = "a";

    public MyThread() {
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        super.run();
        int numInt = Integer.parseInt(num);
        System.out.println(numInt + " "+ num);
        while (true) {

        }
    }
}
