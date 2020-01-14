package com.imyiren.part2.t1;

/**
 * className HasSelfPrivateNum
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/12 下午10:32
 */
public class HasSelfPrivateNum {
    /**
     * 此例子中num属于方法内部变量，线程安全
     * @param username
     */
    public void addI(String username) {
        try {
            int num = 0;
            if ("a".equals(username)) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);

            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
