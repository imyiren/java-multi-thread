package io.ilss.part1.interrupt;

/**
 * className: MyThread
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/10 20:40
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
