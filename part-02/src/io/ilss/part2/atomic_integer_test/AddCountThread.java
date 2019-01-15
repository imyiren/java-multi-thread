package io.ilss.part2.atomic_integer_test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * className AddCountThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午9:49
 */
public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
