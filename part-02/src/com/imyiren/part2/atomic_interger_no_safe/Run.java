package com.imyiren.part2.atomic_interger_no_safe;


/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午9:58
 */
public class Run {
    public static void main(String[] args) {
        try {
            /**
             * 虽然用了atomicX类，但是如果不加synchronized还是会出现问题。但是结果是正确的
             */
            MyService service = new MyService();
            MyThread[] array = new MyThread[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = new MyThread(service);
            }
            for (int i = 0; i < array.length; i++) {
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(MyService.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
