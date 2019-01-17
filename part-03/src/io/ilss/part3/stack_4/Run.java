package io.ilss.part3.stack_4;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午6:22
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P[] p = new P[5];
        C[] c = new C[6];
        ThreadP[] pThread = new ThreadP[5];
        ThreadC[] cThread = new ThreadC[6];

        for (int i = 0; i < 5; i++) {
            p[i] = new P(myStack);
            pThread[i] = new ThreadP(p[i]);
            pThread[i].setName("p thread " + i);
            pThread[i].start();
        }

        for (int i = 0; i < 6; i++) {
            c[i] = new C(myStack);
            cThread[i] = new ThreadC(c[i]);
            cThread[i].setName("c thread " + i);
            cThread[i].start();
        }
    }
}
