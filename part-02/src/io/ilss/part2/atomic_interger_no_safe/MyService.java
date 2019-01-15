package io.ilss.part2.atomic_interger_no_safe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * className MyService
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午9:55
 */
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();

    synchronized public void addNum() {
        System.out.println(Thread.currentThread().getName() + "After add 100, the aiRef = " + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
