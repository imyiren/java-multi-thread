package io.ilss.part2.t6;

/**
 * className ThreadA
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 下午1:26
 */
public class ThreadA extends Thread {
    private Task task;

    public ThreadA(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtil.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtil.endTime1 = System.currentTimeMillis();
    }
}
