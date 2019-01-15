package io.ilss.part2.syn_not_extends;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 下午1:14
 */
public class ThreadB extends Thread {

    private Sub sub;

    public ThreadB(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        super.run();
        sub.serviceMethod();
    }
}
