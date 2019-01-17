package io.ilss.part3.pipe_reader_wirter;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * className WriteData
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午6:51
 */
public class WriteData {
    public void writeMethod(PipedWriter out) {
        try {
            System.out.println("write : ");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData);
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
