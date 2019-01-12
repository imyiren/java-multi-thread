package io.ilss.part2.synchronizedmethodlockobject;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/12 下午11:55
 */
public class ThreadB extends Thread {
    private MyObject object;

    public ThreadB(MyObject object) {
        this.object = object;
    }
    @Override
    public void run() {
        super.run();
        object.methodB();
        object.methodA();
    }
}
