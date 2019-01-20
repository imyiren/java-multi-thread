package io.ilss.part7.thread_group_2;

/**
 * className MyThread
 * description MyThread
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 19:13
 */
public class MyThread extends Thread {
    private String num;

    public MyThread(ThreadGroup group, String name, String num) {
        super(group, name);
        this.num = num;
    }

    @Override
    public void run() {
        super.run();
        int numInt = Integer.parseInt(num);
        System.out.println(Thread.currentThread().getName() + " " + numInt);
        while (!this.isInterrupted()) {
        }
    }

}
