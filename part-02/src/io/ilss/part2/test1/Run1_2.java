package io.ilss.part2.test1;

/**
 * className Run1_2
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:28
 */
public class Run1_2 {
    public static void main(String[] args) {
        /**
         * 如果使用不同对象就会异步
         */
        Service service = new Service();
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();

        ThreadA aThread = new ThreadA(object1, service);
        ThreadB bThread = new ThreadB(object2, service);

        aThread.setName("a");
        bThread.setName("b");

        aThread.start();
        bThread.start();
    }
}
