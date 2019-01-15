package io.ilss.part2.atomic_interger_no_safe;

/**
 * className MyThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午9:57
 */
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.addNum();
    }
}
