package io.ilss.part3.wait_has_param_method;

/**
 * className MyRunnable
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午9:00
 */
public class MyRunnable {
    private static Object lock = new Object();
    private static Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin timer = " + System.currentTimeMillis());
                    /**
                     * 等待5s如果没有被其他线程唤醒，超过时间则自动唤醒
                     */
                    lock.wait(5000);
                    System.out.println("wait   end timer = " + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        Thread t = new Thread(runnable1);
        t.start();
    }
}
