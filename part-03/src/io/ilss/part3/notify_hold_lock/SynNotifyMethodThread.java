package io.ilss.part3.notify_hold_lock;

/**
 * className SynNotifyMethodThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午6:23
 */
public class SynNotifyMethodThread extends Thread {
    private Object lock;

    public SynNotifyMethodThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
