package io.ilss.part3.join_exception;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午8:34
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            ThreadA aThread = new ThreadA();
            aThread.start();
            aThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread B catch print");
            e.printStackTrace();
        }
    }
}
