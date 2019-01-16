package io.ilss.part3.wait_old;



/**
 * className Add
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午9:17
 */
public class Add {
    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
