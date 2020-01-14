package com.imyiren.part2.set_new_properties_lock_one;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午8:10
 */
public class Run {
    public static void main(String[] args) {
        try {
            /**
             * 只要对象不变，即使对象的属性被改变，运行的结果还是同步。
             */
            Service service = new Service();
            UserInfo userInfo = new UserInfo();
            ThreadA aThread = new ThreadA(service, userInfo);
            ThreadB bThread = new ThreadB(service, userInfo);
            aThread.setName("A");
            bThread.setName("B");
            aThread.start();
            Thread.sleep(50);
            bThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
