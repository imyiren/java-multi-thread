package com.imyiren.part3.stack_4;

import java.util.ArrayList;
import java.util.List;

/**
 * className MyStack
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午6:13
 */
public class MyStack {
    private List<String> list = new ArrayList<>();

    synchronized public void push() {
        try {
            while (list.size() == 1) {
                this.wait();
            }
            list.add("anyString = " + Math.random());
            this.notifyAll();
            System.out.println("push = " + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop() {
        String returnValue = "";
        try {
            while (list.size() == 0) {
                System.out.println("pop thread " + Thread.currentThread().getName() + " process is waiting");
                this.wait();
            }
            returnValue = "" + list.get(0);
            list.remove(0);
            this.notifyAll();
            System.out.println("pop = " + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
