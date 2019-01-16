package io.ilss.part3.wait_old;

/**
 * className ThreadSubstract
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午9:23
 */
public class ThreadSubstract extends Thread {
    private Substract r;

    public ThreadSubstract(Substract r) {
        this.r = r;
    }

    @Override
    public void run() {
        super.run();
        r.substract();
    }
}
