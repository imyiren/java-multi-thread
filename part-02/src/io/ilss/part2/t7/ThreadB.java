package io.ilss.part2.t7;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 下午2:26
 */
public class ThreadB extends Thread {
    private Task task;


    public ThreadB(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
