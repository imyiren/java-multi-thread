package io.ilss.part3.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * className MyList
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/16 下午12:14
 */
public class MyList {
    private static List<String> list = new ArrayList<>();
    public static void add() {
        list.add("anyString");
    }
    public static int size() {
        return list.size();
    }
}
