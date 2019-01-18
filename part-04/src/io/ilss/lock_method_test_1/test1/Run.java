package io.ilss.lock_method_test_1.test1;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午5:45
 */
public class Run {
    public static void main(String[] args) {
        //getiHoldCount的作用是查询当前线程保持此锁定的个数，也就是调用lock()方法次数。
        Service service = new Service();
        service.serviceMethod1();
    }
}
