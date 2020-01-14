package com.imyiren.part2.syn_static_method;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:44
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        Service.printB();
    }
}
