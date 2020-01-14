package com.imyiren.part3.two_thread_trans_data;

/**
 * className NotifyThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 上午11:15
 */
public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        //super.run();
        try {
            while (true) {
                System.out.println(list.size());
                if (list.size() == 5) {
                    System.out.println("size == 5 , Thread B out");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
