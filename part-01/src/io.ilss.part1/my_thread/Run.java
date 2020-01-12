package io.ilss.part1.my_thread;

/**
 * className: Run
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/9 18:02
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.start();
        System.out.println("运行结束！");
    }
}
