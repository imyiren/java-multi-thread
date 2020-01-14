package com.imyiren.part3.wait_notify_insert_test;

/**
 * className BackUpA
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午7:52
 */
public class BackUpA extends Thread {
    private DBTools dbTools;

    public BackUpA(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        dbTools.backUpA();
    }
}
