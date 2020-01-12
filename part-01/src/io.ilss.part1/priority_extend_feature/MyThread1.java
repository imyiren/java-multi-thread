package io.ilss.part1.priority_extend_feature;

/**
 * className: MyThread1
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/15 16:18
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority=" + this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}
