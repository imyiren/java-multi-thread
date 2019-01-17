package io.ilss.part3.pipe_input_output;

import java.io.PipedInputStream;

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
    private PipedInputStream in;

    public ReadThread(ReadData read, PipedInputStream in) {
        this.read = read;
        this.in = in;
    }

    @Override
    public void run() {
        super.run();
        read.readMethod(in);
    }
}
