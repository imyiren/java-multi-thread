package io.ilss.part1.share;

/**
 * className: Run
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/9 22:05
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
