package io.ilss.part2.t9;

import java.util.ArrayList;
import java.util.List;

/**
 * className MyOneList
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午3:47
 */
public class MyOneList {
    private List<String> list = new ArrayList<>();

    synchronized public void add(String data) {
        list.add(data);
    }

    synchronized public int getSize() {
        return list.size();
    }

}
