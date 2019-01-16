package io.ilss.part3.two_thread_trans_data;

import java.util.ArrayList;
import java.util.List;

/**
 * className MyList
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午10:17
 */
public class MyList {
    List<String> list = new ArrayList<>();

    public void add() {
        list.add("谁谁");
    }

    public int size() {
        return list.size();
    }

}
