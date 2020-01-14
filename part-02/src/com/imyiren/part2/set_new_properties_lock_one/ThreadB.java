package com.imyiren.part2.set_new_properties_lock_one;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午8:09
 */
public class ThreadB extends Thread {
    private Service service;
    private UserInfo userInfo;

    @Override
    public void run() {
        super.run();
        service.serviceMethodA(userInfo);
    }

    public ThreadB(Service service, UserInfo userInfo) {
        this.service = service;
        this.userInfo = userInfo;
    }

}
