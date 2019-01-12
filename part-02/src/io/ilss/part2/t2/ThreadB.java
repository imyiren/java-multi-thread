package io.ilss.part2.t2;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/12 下午11:25
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
