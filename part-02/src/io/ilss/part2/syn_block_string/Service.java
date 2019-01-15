package io.ilss.part2.syn_block_string;

/**
 * className Service
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午1:30
 */
public class Service {
    private String usernameParam;
    private String passwordparam;
    //private String anyString = new String();

    public void setUsernamePassword(String username, String password) {
        try {
            String anyString = new String();
            synchronized (anyString) {
                System.out.println("thread name = " + Thread.currentThread().getName() + " come in  at " + System.currentTimeMillis());
                usernameParam = username;
                Thread.sleep(3000);
                passwordparam = password;
                System.out.println("thread name = " + Thread.currentThread().getName() + " out  at " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
