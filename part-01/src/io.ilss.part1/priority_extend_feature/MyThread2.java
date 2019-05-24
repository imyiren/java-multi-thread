package io.ilss.part1.priority_extend_feature;

/**
 * className: MyThread2
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/15 16:19
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }
}
