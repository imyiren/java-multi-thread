package io.ilss.lock_method_test_1.test2;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午5:52
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod1();
            }
        };

        Thread[] thread = new Thread[10];
        for (int i = 0; i < 10; i++) {
            thread[i] = new Thread(runnable);
        }

        for (int i = 0; i < 10; i++) {
            thread[i].start();
        }
        Thread.sleep(2000);
        //等待线程数，如：有5个线程，一个线程执行了await方法过后，调用getQuereLength()返回4。说明有4个线程同时在等待lock的释放。
        System.out.println(service.lock.getQueueLength() + " processes is waiting!");
    }
}
