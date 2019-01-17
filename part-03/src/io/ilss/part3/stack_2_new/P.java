package io.ilss.part3.stack_2_new;

/**
 * className P
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午6:19
 */
public class P {
    private MyStack myStack;

    public P(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}
