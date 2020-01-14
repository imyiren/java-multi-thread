package com.imyiren.part3.pipe_reader_wirter;


import java.io.PipedWriter;

/**
 * className WriteThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午6:56
 */
public class WriteThread extends Thread {
    private WriteData writeData;
    private PipedWriter out;

    public WriteThread(WriteData writeData, PipedWriter out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        super.run();
        writeData.writeMethod(out);
    }
}
