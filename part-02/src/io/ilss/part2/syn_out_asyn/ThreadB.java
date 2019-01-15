package io.ilss.part2.syn_out_asyn;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午2:01
 */
public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100000; i++) {
            list.add("ThreadB" + (i + 1));
        }
    }
}
