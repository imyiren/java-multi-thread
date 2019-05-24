package io.ilss.part2.volatile_test_thread;

/**
 * className MyThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午9:28
 */
public class MyThread extends Thread {
    volatile public static int count;

    synchronized private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
