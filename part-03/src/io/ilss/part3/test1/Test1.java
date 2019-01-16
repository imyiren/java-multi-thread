package io.ilss.part3.test1;

/**
 * className Test1
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午10:18
 */
public class Test1 {
    public static void main(String[] args) {
        /**
         * 只能在同步方法或者同步块中调用wait()方法
         * 在执行wait()方法后，当前线程释放锁
         * 在wait()返回前，该线程与其他线程竞争重新获得锁
         * 如果调用wait()时没有持有适当的锁，则会抛出IllegalMonitorStateException（RuntimeException）因此不需要try-catch
         *
         * 方法notify()也需要在同步方法或者同步块中调用。
         * 如果调用notify()时没有持有适当的锁，则也会抛出IllegalMonitorStateException
         * 该方法用来通知那些可能等待该对象的对象锁的其他线程，如果有多个线程等待，则由线程规划器随机挑选出其中一个wait()状态的线程，对其发出notify，并使它等待获取该对象的的对象锁
         * 在执行notify()方法后，当前线程不会马上释放对象锁，呈wait状态的线程也并不能马上获取该对象锁，要等到执行notify()方法的线程将程序执行完，
         * 也就是退出synchronized代码块后，当前线程才会释放，呈wait状态的所在线程才可以获取该对象锁。
         * 当第一个获取了该对象锁的wait线程运行完毕后，他会释放掉该对象锁
         * 此时如果没有再次使用notify语句，即便该对象已经空闲，其他wait状态的线程由于没有得到该对象的通知，还会继续阻塞在wait状态。知道这个对象发出一个notify或notifyAll
         *
         * wait使线程停止运行，而 notify使停止的线程继续运行。
         */


        /**
         * 出现错误的原因是没有"对象监视器"， 也就是没有加同步锁。
         */
        try {
            String newString = new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
