package io.ilss.part3.p_r_test;


/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午10:15
 */
public class Run {
    public static void main(String[] args) {
        String lock = "";
        P p = new P(lock);
        C c = new C(lock);
        ThreadP pThread = new ThreadP(p);
        ThreadCu cThread = new ThreadCu(c);
        pThread.start();
        cThread.start();
    }
}
