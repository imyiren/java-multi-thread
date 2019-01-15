package io.ilss.part2.two_stop;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午5:41
 */
public class Run {
    public static void main(String[] args) {
        /**
         * B线程永远得不到机会运行
         *
         * 更改service 把synchronized方法改成改成synchronized代码块。
         *
         */
        Service service = new Service();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        aThread.start();
        bThread.start();
    }
}
