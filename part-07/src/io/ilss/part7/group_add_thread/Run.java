package io.ilss.part7.group_add_thread;

/**
 * className Run1
 * description Run1
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 15:22
 */
public class Run {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadGroup group = new ThreadGroup("X process group!");
        Thread aThread = new Thread(group, a);
        Thread bThread = new Thread(group, b);
        aThread.start();
        bThread.start();
        System.out.println("Active process number : " + group.activeCount());
        System.out.println("       process  name  : " + group.getName());
    }
}
