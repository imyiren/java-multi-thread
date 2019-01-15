package io.ilss.part2.syn_out_asyn;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午2:01
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 从打印结果看，run和out是成对出现的，但是由于线程执行方法的顺序不一定，
         * 当两个线程执行带有分支判断方法时，就会出现逻辑上的错误。可能出现脏读
         */
        MyList list = new MyList();
        ThreadA aThread = new ThreadA(list);
        ThreadB bThread = new ThreadB(list);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }
}
