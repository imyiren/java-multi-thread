package io.ilss.part2.inner_test1;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午7:18
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 由于持有不同的对象监视器，所以监视器结果打印结果是乱序。
         */
        final OutClass.Inner inner = new OutClass.Inner();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        }, "A");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        }, "B");
        t1.start();
        t2.start();
    }
}
