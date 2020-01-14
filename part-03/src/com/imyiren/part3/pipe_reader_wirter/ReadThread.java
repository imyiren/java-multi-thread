package com.imyiren.part3.pipe_reader_wirter;

import java.io.PipedReader;

/**
 * className ReadThread
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午6:57
 */
public class ReadThread extends Thread {
    private ReadData read;
    private PipedReader in;

    public ReadThread(ReadData read, PipedReader in) {
        this.read = read;
        this.in = in;
    }

    @Override
    public void run() {
        super.run();
        read.readMethod(in);
    }
}
