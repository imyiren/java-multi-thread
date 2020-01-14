package com.imyiren.part4.try_lock_param;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午9:09
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();

        //tryLock带参数时，如果锁定在给定等待时间内没有被另一个线程保持，并且当前线程未被终端，则获取该锁定。
        Runnable runnableRef = () -> {
            System.out.println(Thread.currentThread().getName() + "调用waitMethod时间：" + System.currentTimeMillis());
            service.waitMethod();
        };
        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
    }
}
