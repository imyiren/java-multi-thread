package com.imyiren.part3.two_thread_trans_data;

/**
 * className ThreadA
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午10:28
 */
public class ThreadA extends Thread {
    private MyList list;

    public ThreadA(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        //super.run();
        try {
            for (int i = 0; i < 10; i++) {
                list.add();
                System.out.println(Thread.currentThread().getName() + " add " + (i + 1));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
