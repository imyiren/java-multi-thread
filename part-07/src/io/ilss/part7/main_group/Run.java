package io.ilss.part7.main_group;

/**
 * className Run
 * description Run
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 16:20
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("The name of thread group is " + Thread.currentThread().getThreadGroup().getName());
        System.out.println("The active thread number of thread group is " + Thread.currentThread().getThreadGroup().activeCount());
        System.out.println("Before addition, The number of thread group is " + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup newGroup = new ThreadGroup(Thread.currentThread().getThreadGroup(), "newGroup");
        System.out.println("After addition, The number of thread group is " + Thread.currentThread().getThreadGroup().activeGroupCount());
        System.out.printf("Parent thread name " + Thread.currentThread().getThreadGroup().getParent().getName());
    }
}
