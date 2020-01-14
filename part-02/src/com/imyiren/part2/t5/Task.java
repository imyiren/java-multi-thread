package com.imyiren.part2.t5;

/**
 * className Task
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 下午1:22
 */
public class Task {
    private String getData1;
    private String getData2;

    synchronized public void doLongTimeTask() {
        try {
            System.out.println("begin task!");
            Thread.sleep(3000);
            getData1 = "长时间处理任务后从远程返回的值1 thread name = " + Thread.currentThread().getName();
            getData2 = "长时间处理任务后从远程返回的值2 thread name = " + Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
