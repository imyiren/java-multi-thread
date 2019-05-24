package io.ilss.part1.interrupt;

/**
 * className: Run
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/10 20:40
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1？=" + thread.isInterrupted());
            System.out.println("是否停止2？=" + thread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }

    //public static void main(String[] args) {
    //    Thread.currentThread().interrupt();
    //    System.out.println("是否停止1？=" + Thread.interrupted());
    //    System.out.println("是否停止2？=" + Thread.interrupted());
    //}
}
