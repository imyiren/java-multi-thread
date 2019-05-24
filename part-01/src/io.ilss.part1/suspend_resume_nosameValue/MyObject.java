package io.ilss.part1.suspend_resume_nosameValue;

/**
 * className: MyObject
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/14 22:17
 */
public class MyObject {
    private String username = "1";
    private String password = "11";

    public void setValue(String u, String p) {
        this.username = u;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程！");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    public void printUsernamePassword() {
        System.out.println(username + " " + password);
    }
}
