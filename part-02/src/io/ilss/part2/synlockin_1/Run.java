package io.ilss.part2.synlockin_1;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 上午12:41
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 可重入锁，也就是说，对象自己可以再次在synchronized方法类获取自己内部的synchronized方法。
         */
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
