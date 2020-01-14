package com.imyiren.part3.first_notify;

/**
 * className MyRun
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午9:06
 */
public class MyRun1 {
    private String lock = new String("");
    private boolean isFirstRunB = false;
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    while (!isFirstRunB) {
                        System.out.println("begin wait");
                        lock.wait();
                        System.out.println("  end wait");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin");
                lock.notify();
                System.out.println("notify   end");
                isFirstRunB = true;
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        MyRun1 run = new MyRun1();
        Thread a = new Thread(run.runnableA);
        Thread b = new Thread(run.runnableB);

        a.start();
        Thread.sleep(100);
        b.start();
    }
}
