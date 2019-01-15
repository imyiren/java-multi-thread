package io.ilss.part2.doublesynblockonetwo;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午12:36
 */
public class ThreadB extends Thread {
    private ObjectService service;


    public ThreadB(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }
}
