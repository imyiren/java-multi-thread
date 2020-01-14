package com.imyiren.part2.syn_lock_in_2;

/**
 * className MyThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 上午12:48
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
