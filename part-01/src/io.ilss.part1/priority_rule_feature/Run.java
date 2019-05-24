package io.ilss.part1.priority_rule_feature;

import io.ilss.part1.yield.MyThread;

/**
 * className: Run
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/15 16:30
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(10);
            thread1.start();
            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(1);
            thread2.start();
        }
    }
}
