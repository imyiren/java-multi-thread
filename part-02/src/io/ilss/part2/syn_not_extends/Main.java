package io.ilss.part2.syn_not_extends;

/**
 * className Main
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 下午1:10
 */
public class Main {
    synchronized public void serviceMethod() {
        try {
            System.out.println("int main next step begin thread name = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main next step sleep end thread name = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
