package io.ilss.condition_test_many_to_many;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午5:17
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA[] aThread = new ThreadA[10];
        ThreadB[] bThread = new ThreadB[10];
        for (int i = 0; i < 10; i++) {
            aThread[i] = new ThreadA(service);
            bThread[i] = new ThreadB(service);
            aThread[i].start();
            bThread[i].start();
        }
    }
}
