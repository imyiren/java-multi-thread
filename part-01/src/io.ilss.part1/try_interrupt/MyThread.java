package io.ilss.part1.try_interrupt;

/**
 * className: MyThread
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/10 20:55
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (MyThread.interrupted()) {
                System.out.println("已经是停止状态了！我要退了！");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println("我在for下面");
    }

}
