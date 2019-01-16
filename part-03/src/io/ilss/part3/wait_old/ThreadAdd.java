package io.ilss.part3.wait_old;

/**
 * className ThreadAdd
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午9:23
 */
public class ThreadAdd extends Thread {
    private Add p;

    public ThreadAdd(Add p) {
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        p.add();
    }
}
