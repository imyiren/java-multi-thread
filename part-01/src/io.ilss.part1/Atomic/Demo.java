package io.ilss.part1.Atomic;


import sun.misc.Unsafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * className: Demo
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/16 15:03
 */
public class Demo {
    int i = 0;  //不具有原子性
    int l = 0;
    ZpLock lock = new ZpLock();      //可重入锁

    public void incr() {
        lock.lock();
        try{
            i++;
            l++;
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws Exception{
        Demo demo = new Demo();
        //Unsafe unsafe = new Unsafe();
        for (int j = 0; j < 2; j++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread());
                for (int k = 0; k < 10000; k++) {
                    demo.incr();
                }
            }).start();
        }
        Thread.currentThread().sleep(1000L);
        System.out.println("i:"+demo.i);
        System.out.println("l:"+demo.l);
    }

}
