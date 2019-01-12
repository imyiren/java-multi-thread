package io.ilss.part2.synchronizedmethodlockobject;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/12 下午11:56
 */
public class Run {
    public static void main(String[] args) {
        //如果不加synchronized会出现A输出后等待，然后转而执行B，如果加了,那么两个如果A发生那么B就开始等着A执行完成后，再执行。
        MyObject object = new MyObject();
        ThreadA aThread = new ThreadA(object);
        ThreadB bThread = new ThreadB(object);
        aThread.setName("A");
        bThread.setName("B");
        aThread.start();
        bThread.start();
    }
}
