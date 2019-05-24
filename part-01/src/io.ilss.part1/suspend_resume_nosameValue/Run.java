package io.ilss.part1.suspend_resume_nosameValue;

/**
 * className: Run
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/14 22:26
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                myObject.setValue("a", "aa");
            }
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                myObject.printUsernamePassword();
            }
        };
        thread2.start();
    }
}
