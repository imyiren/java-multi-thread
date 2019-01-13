package io.ilss.part2.synchronizedonethreadin;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 下午1:42
 */
public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        aThread.setName("a");
        bThread.setName("b");
        aThread.start();
        bThread.start();
    }
}
