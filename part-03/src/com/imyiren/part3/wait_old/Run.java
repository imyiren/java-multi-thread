package com.imyiren.part3.wait_old;

/**
 * className Run1
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午9:24
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = "";
        Add add = new Add(lock);
        Substract substract = new Substract(lock);
        ThreadSubstract subThread1 = new ThreadSubstract(substract);
        ThreadSubstract subThread2 = new ThreadSubstract(substract);
        ThreadAdd addThread = new ThreadAdd(add);
        subThread1.setName("subThread 1");
        subThread2.setName("subThread 2");
        addThread.setName("addThread 2");
        subThread1.start();
        subThread2.start();
        Thread.sleep(10000);
        addThread.start();

    }
}
