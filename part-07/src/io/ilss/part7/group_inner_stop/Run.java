package io.ilss.part7.group_inner_stop;

/**
 * className Run
 * description Run
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 16:30
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadGroup group = new ThreadGroup("my group");
            for (int i = 0; i < 5; i++) {
                MyThread thread = new MyThread(group, "thread " + (i + 1));
                thread.start();
            }
            Thread.sleep(5000);
            group.interrupt();
            System.out.println("call interrupt method!");
        } catch (InterruptedException e) {
            System.out.println("Stop it!");
            e.printStackTrace();
        }
    }
}
