package io.ilss.part2.test2;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:33
 */
public class ThreadB extends Thread {
    private MyObject object;

    public ThreadB(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}