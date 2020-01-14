package com.imyiren.part3.inheritable_thread_local;

/**
 * className InheritableThreadLocalExt
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午2:25
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal<Long> {
    @Override
    protected Long initialValue() {
        return System.currentTimeMillis();
    }

}
