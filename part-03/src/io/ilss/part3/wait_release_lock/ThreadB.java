package io.ilss.part3.wait_release_lock;

/**
 * className NotifyThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午6:16
 */
public class ThreadB  extends Thread{
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.testMethod(lock);
    }
}