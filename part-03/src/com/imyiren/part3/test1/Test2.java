package com.imyiren.part3.test1;

/**
 * className Test2
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午12:02
 */
public class Test2 {
    public static void main(String[] args) {
        /**
         * 方法wait线面的代码不执行了。
         */
        try {
            String lock = new String();
            System.out.println("before syn");
            synchronized (lock) {
                System.out.println("syn the first line");
                lock.wait();
                System.out.println("after wait");
            }
            System.out.println("after syn");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
