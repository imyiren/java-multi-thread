package io.ilss.part7.get_group_parent;

/**
 * className Run
 * description Run
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 16:15
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("Thread : " + Thread.currentThread().getName() + "This thread group name is " + Thread.currentThread().getThreadGroup().getName());
        System.out.println("The parent thread name of Main thread group is " + Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println("The parent thread name of parent thread of main thread group is " + Thread.currentThread().getThreadGroup().getParent().getName());
    }
}
