package io.ilss.part3.join_sleep_2;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午8:51
 */
public class Run {
    public static void main(String[] args) {
        try {
            /**
             * 验证join会释放锁
             */
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
