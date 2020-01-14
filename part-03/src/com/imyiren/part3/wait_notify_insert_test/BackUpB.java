package com.imyiren.part3.wait_notify_insert_test;

/**
 * className BackUpB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午7:52
 */
public class BackUpB extends Thread {
    private DBTools dbTools;

    public BackUpB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        dbTools.backUpB();
    }
}
