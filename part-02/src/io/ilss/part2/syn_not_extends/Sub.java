package io.ilss.part2.syn_not_extends;

/**
 * className Sub
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 下午1:12
 */
public class Sub extends Main {
    @Override
    synchronized public void serviceMethod() {
        try {
            System.out.println("int sub next step begin thread name = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub next step sleep end thread name = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
