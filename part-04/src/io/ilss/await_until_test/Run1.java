package io.ilss.await_until_test;

/**
 * className Run1
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午9:20
 */
public class Run1 {
    public static void main(String[] args){
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        //awaitUntil(时间)   等待， 直到到这个时间就停止等待。等待中间可以被signal提前唤醒
        myThreadA.start();
    }
}
