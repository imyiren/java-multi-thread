package io.ilss.part2.synblockstring2;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午1:43
 */
public class Service {
    private String anyString = new String();
    public void a() {
        try {
            synchronized (anyString) {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a   end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void b() {
        System.out.println("b begin");
        System.out.println("b   end");
    }

}
