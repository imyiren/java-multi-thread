package com.imyiren.part2.syn_block_string;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午1:36
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 此处如果synchronized(非this对象x) x不同则不同步，只对x相同的进行同步。
         */
        Service service = new Service();
        ThreadA aThread = new ThreadA(service);
        ThreadB bThread = new ThreadB(service);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }
}
