package io.ilss.part3.pipe_input_output;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * className Run1
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午6:58
 */
public class Run {
    public static void main(String[] args) throws IOException, InterruptedException {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();
        PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream();

        //使用connect的作用是 使两个Stream之间产生同行链接，这样才可以将数据进行输出输入。
        //in.connect(out)
        out.connect(in);

        ReadThread readThread = new ReadThread(readData, in);
        WriteThread writeThread = new WriteThread(writeData, out);

        readThread.start();

        Thread.sleep(2000);

        writeThread.start();
    }
}
