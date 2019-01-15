package io.ilss.part2.syn_lock_in_2;

/**
 * className Main
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 上午12:44
 */
public class Main {
    public int i = 10;

    synchronized public void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i = " + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
