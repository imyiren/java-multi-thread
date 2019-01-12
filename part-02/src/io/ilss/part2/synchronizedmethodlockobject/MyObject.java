package io.ilss.part2.synchronizedmethodlockobject;

/**
 * className MyObject
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/12 下午11:52
 */
public class MyObject {
    public synchronized void methodA() {
        try {
            System.out.println("begin method A thread name = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
