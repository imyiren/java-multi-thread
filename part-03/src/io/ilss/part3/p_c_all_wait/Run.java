package io.ilss.part3.p_c_all_wait;


/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午10:25
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = "";
        int pLen = 2;
        int cLen = 2;
        P p = new P(lock);
        C c = new C(lock);
        ThreadP[] pThread = new ThreadP[pLen];
        ThreadCu[] cThread = new ThreadCu[cLen];
        for (int i = 0; i < pLen; i++) {
            pThread[i] = new ThreadP(p);
            pThread[i].setName("Provider " + (i + 1));
            pThread[i].start();
        }
        for (int i = 0; i < cLen; i++) {
            cThread[i] = new ThreadCu(c);
            cThread[i].setName("consumer " + (i + 1));
            cThread[i].start();
        }
        Thread.sleep(5000);
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i].getName() + " " + threads[i].getState());
        }
    }
}
