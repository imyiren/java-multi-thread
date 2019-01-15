package io.ilss.part2.doublesynblockonetwo;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午12:37
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 使用synchronized(this)代码块时，当一个线程访问一个synchronized同步代码块时，
         * 其他线程对同一个object中所有其他同步代码块的访问将被阻塞。
         * 这说明synchronized使用"对象监视器"是一个
         */
        ObjectService service = new ObjectService();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        aThread.setName("a");
        aThread.start();
        bThread.setName("b");
        bThread.start();
    }
}
