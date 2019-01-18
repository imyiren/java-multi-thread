package io.ilss.condition_test;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午5:06
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.start();
        b.start();
    }
}
