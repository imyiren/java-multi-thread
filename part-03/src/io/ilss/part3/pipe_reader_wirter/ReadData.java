package io.ilss.part3.pipe_reader_wirter;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * className ReadData
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午6:52
 */
public class ReadData {
    public void readMethod(PipedReader in) {
        try {
            System.out.println("read : ");
            char[] ch = new char[20];
            int length = in.read(ch);
            while (length != -1) {
                String newData = new String(ch, 0, length);
                System.out.print(newData);
                length = in.read(ch);
            }
            System.out.println();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
