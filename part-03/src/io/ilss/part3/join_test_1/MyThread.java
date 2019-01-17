package io.ilss.part3.join_test_1;

import java.time.chrono.ThaiBuddhistEra;

/**
 * className MyThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午7:57
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            int secondValue = (int) (Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
