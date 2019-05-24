package io.ilss.part1.priority_rule_feature;

import java.util.Random;

/**
 * className: MyThread1
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/15 16:25
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("*****thread 1 use time=" + (endTime - beginTime));
    }

}
