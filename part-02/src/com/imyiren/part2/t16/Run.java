package com.imyiren.part2.t16;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午8:40
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 如果是正常运行会显示线程被停止
         * 如果在idea上 edit configurations 中 program arguments设置-server
         * 该线程将一直执行，不停止。
         * 这是由于私有堆栈中的值和共有堆栈中的值不同步造成的。
         * 解决这个问题就需要用volatile关键字，他的主要作用是当线程访问isRunning这个变量时，强制性从共有堆栈中进行取值。
         *
         */
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("isRunning is set by false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
