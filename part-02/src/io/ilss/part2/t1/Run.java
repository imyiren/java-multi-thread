package io.ilss.part2.t1;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/12 下午11:27
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA aThread = new ThreadA(numRef);
        aThread.start();
        ThreadB bThread = new ThreadB(numRef);
        bThread.start();
    }
}
