package io.ilss.part2.synlockin_1;

/**
 * className MyThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 上午12:41
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.service1();
    }
}
