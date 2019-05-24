package io.ilss.part1.priority_random_feature;

import java.util.Random;

/**
 * className: MyThread1
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/15 16:34
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("*****thread 1 use time=" + (endTime - beginTime));
    }
}
