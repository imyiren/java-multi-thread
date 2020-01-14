package com.imyiren.part3.thread_local_33;

import java.util.Date;

/**
 * className ThreadLocalExt
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午2:19
 */
public class ThreadLocalExt extends ThreadLocal<Long> {
    @Override
    protected Long initialValue() {
        return System.currentTimeMillis();
    }
}
