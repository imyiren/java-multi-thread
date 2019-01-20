package io.ilss.part7.thread_create_exception;

/**
 * className Main3
 * description Main3
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 18:52
 */
public class Main3 {
    public static void main(String[] args) {
        MyThread.setDefaultUncaughtExceptionHandler((t,e)->{
            System.out.println(t.getName() + " Occur Exception. ");
            e.printStackTrace();
        });
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
