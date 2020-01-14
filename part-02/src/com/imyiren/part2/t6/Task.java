package com.imyiren.part2.t6;

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

    public void doLongTimeTask() {
        try {
            System.out.println("begin task!");
            Thread.sleep(3000);
            String privateData1 = "长时间处理任务后从远程返回的值1 thread name = " + Thread.currentThread().getName();
            String privateData2 = "长时间处理任务后从远程返回的值2 thread name = " + Thread.currentThread().getName();
            synchronized (this) {
                getData1 = privateData1;
                getData2 = privateData2;
            }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
