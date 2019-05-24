package io.ilss.part1.return_interrupt;

/**
 * className: MyThread
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/14 15:44
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了！");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }
}
