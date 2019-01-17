package io.ilss.part3.join_exception;

/**
 * className Run1
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午8:36
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB bThread = new ThreadB();
            bThread.start();
            Thread.sleep(500);
            ThreadC cThread = new ThreadC(bThread);
            cThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
