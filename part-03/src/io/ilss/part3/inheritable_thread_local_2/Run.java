package io.ilss.part3.inheritable_thread_local_2;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午2:27
 */
public class Run {
    public static void main(String[] args) {
        //子线程用InheritableThreadLocal就可以共享父线程的数据。
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main process value = " + Tools.t1.get());
                Thread.sleep(101);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
