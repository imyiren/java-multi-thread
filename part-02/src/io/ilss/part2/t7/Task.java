package io.ilss.part2.t7;

/**
 * className Task
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 下午2:23
 */
public class Task {
    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("no synchronized thread name = " + Thread.currentThread().getName() + " i = " + (i + 1));
        }
        System.out.println();
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized thread name = " + Thread.currentThread().getName() + " i = " + (i + 1));
            }
        }
    }
}
