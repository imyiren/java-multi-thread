package io.ilss.part2.syn_lock_in_2;

/**
 * className Sub
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 上午12:46
 */
public class Sub extends Main {
    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("Sub print i = " + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
