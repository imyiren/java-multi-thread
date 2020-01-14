package com.imyiren.part2.t10;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午8:31
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 当下面代码运行在-server服务器模式中64bit的JVM上时，会出现死循环。解决的办法是使用volatile
         */
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        System.out.println("I want to stop it ! stop thread = " + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
