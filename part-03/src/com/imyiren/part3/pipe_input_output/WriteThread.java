package com.imyiren.part3.pipe_input_output;

import java.io.PipedOutputStream;

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
    private PipedOutputStream out;

    public WriteThread(WriteData writeData, PipedOutputStream out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        super.run();
        writeData.writeMethod(out);
    }
}
