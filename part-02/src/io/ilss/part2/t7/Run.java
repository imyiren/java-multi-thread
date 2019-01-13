package io.ilss.part2.t7;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 下午2:27
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 在没有synchronized包裹的代码中会有随机性，但是进入synchronized代码块就会排队执行
         */
        Task task = new Task();
        ThreadA aThread = new ThreadA(task);
        ThreadB bThread = new ThreadB(task);
        aThread.start();
        bThread.start();
    }
}
