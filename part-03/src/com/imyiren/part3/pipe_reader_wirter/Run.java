package com.imyiren.part3.pipe_reader_wirter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * className Run1
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午7:18
 */
public class Run {
    public static void main(String[] args) throws IOException, InterruptedException {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();
        PipedReader in = new PipedReader();
        PipedWriter out = new PipedWriter();

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
