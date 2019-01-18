package io.ilss.part3.inheritable_thread_local_2;

/**
 * className InheritableThreadLocalExt
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午2:25
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal<String> {
    @Override
    protected String initialValue() {
        return ""+System.currentTimeMillis();
    }

    @Override
    protected String childValue(String parentValue) {
        return parentValue + " child string";
    }
}
