package io.ilss.part2.t3;

/**
 * className Test
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 上午12:16
 */
public class Test {
    public static void main(String[] args) {
        try {
            /**
             * 如果方法B不加synchronized关键字，那么调用B方法就可能会读到脏数据;
             * 如果加了，那么在调用B方法之前已经进入A方法执行没有结束，那么B方法的调用就会出现等待。A方法结束过后才会执行B方法
             * 也就是说，如果一个对象里面有多个synchronized方法时，调用时相当于加了获得了所在对象的锁。
             */
            PublicVar publicVarRef = new PublicVar();
            ThreadA aThread = new ThreadA(publicVarRef);
            aThread.start();
            Thread.sleep(200);
            publicVarRef.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
