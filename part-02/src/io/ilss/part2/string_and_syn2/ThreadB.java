package io.ilss.part2.string_and_syn2;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午5:26
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        Service.print(new Object());
    }
}
