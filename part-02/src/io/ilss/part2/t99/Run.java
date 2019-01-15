package io.ilss.part2.t99;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午8:26
 */
public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        printStringService.printStringMethod();
        System.out.println("I want to stop it! stop thread = " + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
