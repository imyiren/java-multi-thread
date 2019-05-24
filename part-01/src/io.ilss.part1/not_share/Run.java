package io.ilss.part1.not_share;

/**
 * className: Run
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/9 21:01
 */
public class Run {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}
