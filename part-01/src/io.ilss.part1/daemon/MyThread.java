package io.ilss.part1.daemon;

/**
 * className: MyThread
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/15 16:53
 */
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + (i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
