package io.ilss.part1.priority_random_feature;

import java.util.Random;

/**
 * className: MyThread2
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/15 16:38
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("*****thread 2 use time=" + (endTime - beginTime));
    }
}
