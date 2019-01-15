package io.ilss.part2.syn_block_string2;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午1:48
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 验证synchronized方法与同步synchronized(非this对象)是异步调用
         * 由于对象监视器不同，所以结果就是异步的。
         */
        Service service = new Service();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }
}
