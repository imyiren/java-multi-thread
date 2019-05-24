package io.ilss.part1.suspend_resume_test;

/**
 * className: MyThread
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/14 19:39
 */
public class MyThread extends Thread {
    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }
}
