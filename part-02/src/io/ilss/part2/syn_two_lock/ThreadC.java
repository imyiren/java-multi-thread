package io.ilss.part2.syn_two_lock;

/**
 * className ThreadC
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:51
 */
public class ThreadC extends Thread {
    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printC();
    }
}