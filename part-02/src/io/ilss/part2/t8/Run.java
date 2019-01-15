package io.ilss.part2.t8;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午1:10
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 异步打印会出现在输出随机位置，
         * 同步打印只会出现在doLongTimeTask打印结束
         * 是对象级别的锁
         */
        Task task = new Task();
        ThreadA aThread = new ThreadA(task);
        ThreadB bThread = new ThreadB(task);
        aThread.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bThread.start();

    }
}
