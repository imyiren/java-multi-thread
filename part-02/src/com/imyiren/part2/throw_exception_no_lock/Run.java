package com.imyiren.part2.throw_exception_no_lock;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 下午1:04
 */
public class Run {
    public static void main(String[] args) {
        try {
            /**
             * 出现异常，锁自动释放
             * 也就是说，如果synchronized方法内部抛出异常，或得的锁会自动释放，继续后续调用。
             */
            Service service = new Service();
            ThreadA aThread = new ThreadA(service);
            ThreadB bThread = new ThreadB(service);
            aThread.setName("a");
            aThread.start();
            Thread.sleep(5000);
            bThread.setName("b");
            bThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
