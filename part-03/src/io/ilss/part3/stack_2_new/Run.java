package io.ilss.part3.stack_2_new;

/**
 * className Run1
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午6:22
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);
        ThreadP pThread = new ThreadP(p);
        ThreadC cThread1 = new ThreadC(c1);
        ThreadC cThread2 = new ThreadC(c2);
        ThreadC cThread3 = new ThreadC(c3);
        ThreadC cThread4 = new ThreadC(c4);
        ThreadC cThread5 = new ThreadC(c5);
        pThread.start();
        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
        cThread5.start();
    }
}
