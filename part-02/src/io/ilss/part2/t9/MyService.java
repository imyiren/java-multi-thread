package io.ilss.part2.t9;

/**
 * className MyService
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午3:48
 */
public class MyService {
    public MyOneList addServiceMethod(MyOneList list, String data) {
        try {
            if (list.getSize() < 1) {
                Thread.sleep(2000);
                list.add(data);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
