package com.imyiren.part2.synchronized_update_new_value;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午10:07
 */
public class Service {
    private boolean isContinueRun = true;
    synchronized public void runMethod() {
        String anyString = new String();
        while (true == isContinueRun) {
            synchronized (anyString) {
            }
        }
        System.out.println("stopped!");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}
