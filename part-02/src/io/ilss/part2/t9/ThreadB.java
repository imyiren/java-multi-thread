package io.ilss.part2.t9;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午3:51
 */
public class ThreadB extends Thread {
    private MyOneList list;

    public ThreadB(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        MyService msRef = new MyService();
        msRef.addServiceMethod(list, "A");
    }
}
