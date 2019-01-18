package io.ilss.lock_method_test_3.test1;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午7:46
 */
public class Run {
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        final Service service2 = new Service(false);
        Runnable runnable1 = service1::serviceMethod;
        Runnable runnable2 = service2::serviceMethod;
        //ReentrantLock默认是非公平锁
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
    }
}
