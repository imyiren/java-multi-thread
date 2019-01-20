package io.ilss.part7.group_add_thread;

/**
 * className ThreadB
 * description ThreadB
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 15:21
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread name : " + Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
