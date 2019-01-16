package io.ilss.part3.notify_one;

/**
 * className ThreadC
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午6:45
 */
public class ThreadC extends Thread {
    private Object lock;

    public ThreadC(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.testMethod(lock);
    }
}
