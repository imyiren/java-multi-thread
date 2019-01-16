package io.ilss.part3.notify_hold_lock;

/**
 * className Test
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午6:23
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA aThread = new ThreadA(lock);
        NotifyThread notifyThread = new NotifyThread(lock);
        SynNotifyMethodThread synNotifyMethodThread = new SynNotifyMethodThread(lock);
        aThread.start();
        notifyThread.start();
        synNotifyMethodThread.start();
    }
}
