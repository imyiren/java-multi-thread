package io.ilss.part2.syn_out_asyn;

import java.util.ArrayList;
import java.util.List;

/**
 * className MyList
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午1:57
 */
public class MyList {
    private List list = new ArrayList();

    synchronized public void add(String username) {
        System.out.println("thread name = " + Thread.currentThread().getName() + " run add method");
        list.add(username);
        System.out.println("thread name = " + Thread.currentThread().getName() + " out add method");
    }

    synchronized public int getSize() {
        System.out.println("thread name = " + Thread.currentThread().getName() + " run getSize method");
        int sizeValue = list.size();
        System.out.println("thread name = " + Thread.currentThread().getName() + " out getSize method");
        return sizeValue;
    }
}
