package io.ilss.part3.wait_notify_insert_test;

/**
 * className Run1
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午7:53
 */
public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackUpB backUpB = new BackUpB(dbTools);
            backUpB.start();
            BackUpA backUpA = new BackUpA(dbTools);
            backUpA.start();
        }
    }
}
