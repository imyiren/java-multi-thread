package io.ilss.part2.two_object_two_lock;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/12 下午11:47
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        //多个对象会产生多个锁，也就是说，两个互不干扰
        ThreadA aThread = new ThreadA(numRef1);
        ThreadB bThread = new ThreadB(numRef2);
        aThread.start();
        bThread.start();
    }
}
