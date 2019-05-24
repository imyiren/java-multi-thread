package io.ilss.part7.format_ok_2;

import java.text.SimpleDateFormat;

/**
 * className LRUCache
 * description LRUCache
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 18:04
 */
public class Test {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String[] dateStringArray = new String[] { "2000-01-01", "2000-01-02",
                "2000-01-03", "2000-01-04", "2000-01-05", "2000-01-06",
                "2000-01-07", "2000-01-08", "2000-01-09", "2000-01-10" };

        MyThread[] threadArray = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new MyThread(sdf, dateStringArray[i]);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
