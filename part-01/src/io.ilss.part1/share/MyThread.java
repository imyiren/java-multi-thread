package io.ilss.part1.share;

/**
 * className: MyThread
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/9 21:04
 */
public class MyThread extends Thread {
    private int count = 5;

    //@Override
    //public void run() {
    //    super.run();
    //    count--;
    //    System.out.println("由" + Thread.currentThread().getName() + "计算,count=" + count);
    //}

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由" + Thread.currentThread().getName() + "计算,count=" + count);
    }
}
