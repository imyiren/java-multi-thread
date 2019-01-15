package io.ilss.part2.syn_static_method;

/**
 * className ThreadA
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:43
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        super.run();
        Service.printA();
    }
}
