package io.ilss.fair_onfair_test;

/**
 * className RunFair
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午5:26
 */
public class RunFair {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("★process " + Thread.currentThread().getName() + "run");
                service.serviceMethod();
            }
        };

        Thread[] threadArray = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }

        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
