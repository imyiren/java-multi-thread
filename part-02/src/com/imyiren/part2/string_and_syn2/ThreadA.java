package com.imyiren.part2.string_and_syn2;

/**
 * className ThreadA
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午5:24
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        super.run();
        Service.print(new Object());
    }
}
