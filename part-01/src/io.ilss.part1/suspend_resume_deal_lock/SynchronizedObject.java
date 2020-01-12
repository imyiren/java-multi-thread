package io.ilss.part1.suspend_resume_deal_lock;

/**
 * className: SynchronizedObject
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/14 19:47
 */
public class SynchronizedObject {
    synchronized  public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a 线程永远 suspend 了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
