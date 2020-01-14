package com.imyiren.part3.wait_notify_insert_test;

/**
 * className DBTools
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午7:45
 */
public class DBTools {
    volatile private boolean prevIsA = false;

    synchronized public void backUpA() {
        try {
            while (prevIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("★★★★★️");
            }
            prevIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backUpB() {
        try {
            while (!prevIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("☆☆☆☆☆");
            }
            prevIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
