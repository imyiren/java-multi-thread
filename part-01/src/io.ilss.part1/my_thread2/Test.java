package io.ilss.part1.my_thread2;

/**
 * className: LRUCache
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/9 18:20
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setName("myThread");
            thread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
