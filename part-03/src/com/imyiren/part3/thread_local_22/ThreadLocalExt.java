package com.imyiren.part3.thread_local_22;

/**
 * className ThreadLocalExt
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午2:13
 */
public class ThreadLocalExt extends ThreadLocal<String> {
    @Override
    protected String initialValue() {
        return "default value string!";
    }

}
