package io.ilss.part7.auto_add_group;

/**
 * className Run1
 * description Run1
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 16:12
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("A处线程：" + Thread.currentThread().getName()
                + " 所属的线程组名为："
                + Thread.currentThread().getThreadGroup().getName() + " "
                + " 中有线程组数量：" + Thread.currentThread().getThreadGroup().activeGroupCount());
        //在实例化一个新的线程组的时候，如果不指定所属线程，则自动归到当前线程对象所属的线程组中。
        ThreadGroup group = new ThreadGroup("新的组");
        System.out.println("B处线程：" + Thread.currentThread().getName()
                + " 所属的线程组名为："
                + Thread.currentThread().getThreadGroup().getName() + " "
                + " 中有线程组数量：" + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadGroup);
        for (int i = 0; i < threadGroup.length; i++) {
            System.out.println("第一个线程组名称为：" + threadGroup[i].getName());
        }

    }
}
