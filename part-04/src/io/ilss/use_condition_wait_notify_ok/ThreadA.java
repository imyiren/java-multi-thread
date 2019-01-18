package io.ilss.use_condition_wait_notify_ok;

/**
 * className ThreadA
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午4:27
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.await();
    }
}
