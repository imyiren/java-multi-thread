package io.ilss.part3.join_sleep_2;

/**
 * className ThreadC
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午8:51
 */
public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        super.run();
        threadB.bService();
    }
}
