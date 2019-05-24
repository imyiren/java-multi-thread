package io.ilss.part1.Atomic;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

/**
 * className: ZpLock
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/16 15:28
 */
public class ZpLock implements Lock {

    /**
     * 需要一个钥匙，确保原子性
     */
    AtomicReference<Thread> owner = new AtomicReference<>();

    /**
     * 等待列表
     */
    public LinkedBlockingQueue<Thread> waiters = new LinkedBlockingQueue<>();

    /**
     * 待实现 --> 申请开房（多线程，原子性）
     * 不使用wait是因为需要同步才行
     */
    @Override
    public void lock() {
        //原子操作 使用CAS机制抢钥匙，必须判断为空才能抢
        while (!owner.compareAndSet(null, Thread.currentThread())) {
            //抢不到 加入等待列表
            waiters.add(Thread.currentThread());
            // 进行线程阻塞  断点
            LockSupport.park();
            //如果代码执行到这里，证明该线程被唤醒了 出队
            waiters.remove(Thread.currentThread());
        }
    }

    /**
     * 待实现 --> 退房 多线程
     */
    @Override
    public void unlock() {
        //判断当前线程，是否持有锁
        //退房    --->     owner == null
        //cas操作确保原子性
        if (owner.compareAndSet(Thread.currentThread(), null)) {
            //通知阻塞线程
            Object[] objects = waiters.toArray();
            for (Object object : objects) {
                Thread next = (Thread) object;
                //进行唤醒
                LockSupport.unpark(next);
            }
        }
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
