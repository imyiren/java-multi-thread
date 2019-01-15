package io.ilss.part2.test1;

/**
 * className Run1_1
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:24
 */
public class Run1_1 {
    public static void main(String[] args) {
        /**
         * 同步的原因是 使用了同一个object 作为"对象监视器"
         */
        Service service = new Service();
        MyObject object = new MyObject();

        ThreadA aThread = new ThreadA(object, service);
        ThreadB bThread = new ThreadB(object, service);

        aThread.setName("a");
        bThread.setName("b");

        aThread.start();
        bThread.start();

    }
}
