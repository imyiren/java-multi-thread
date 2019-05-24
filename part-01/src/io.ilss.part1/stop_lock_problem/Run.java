package io.ilss.part1.stop_lock_problem;

/**
 * className: Run
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/14 15:40
 */
public class Run {
    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername() + " " + object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
