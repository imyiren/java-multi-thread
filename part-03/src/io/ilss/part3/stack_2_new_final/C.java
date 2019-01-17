package io.ilss.part3.stack_2_new_final;

/**
 * className C
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/17 下午6:19
 */
public class C {
    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService() {
        System.out.println("pop = " + myStack.pop());
    }
}
