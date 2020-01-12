package io.ilss.part1.return_interrupt;

/**
 * className: Run
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/14 15:51
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}
