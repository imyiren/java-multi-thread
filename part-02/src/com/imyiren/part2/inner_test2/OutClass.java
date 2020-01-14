package com.imyiren.part2.inner_test2;

/**
 * className OutClass
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午7:22
 */
public class OutClass {
    static class InnerClass1 {
        public void method1(innerClass2 class2) {
            String threadName = Thread.currentThread().getName();
            synchronized (class2) {
                System.out.println(threadName + " in class1 method1");
                for (int i = 0; i < 10; i++) {
                    System.out.println("i = " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName + " out class1 method1");
            }
        }

        synchronized public void method2() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " in class1 method2");
            for (int i = 0; i < 10; i++) {
                System.out.println("i = " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " out class1 method2");
        }
    }

    static class innerClass2 {
        synchronized public void method1() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " in class2 method1");
            for (int i = 0; i < 10; i++) {
                System.out.println("i = " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " out class2 method1");
        }
    }
}
