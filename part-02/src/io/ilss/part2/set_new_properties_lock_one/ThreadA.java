package io.ilss.part2.set_new_properties_lock_one;

/**
 * className ThreadA
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午8:08
 */
public class ThreadA extends Thread {
    private Service service;
    private UserInfo userInfo;

    public ThreadA(Service service, UserInfo userInfo) {
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodA(userInfo);
    }
}
