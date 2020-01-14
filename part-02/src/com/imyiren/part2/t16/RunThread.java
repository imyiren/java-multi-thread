package com.imyiren.part2.t16;

/**
 * className RunThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午8:38
 */
public class RunThread extends Thread {
    volatile private boolean isRunning = true;
    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("in run method ");
        while (isRunning == true) {

        }
        System.out.println("end run method");
    }
}
