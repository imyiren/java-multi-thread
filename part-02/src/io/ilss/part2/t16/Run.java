package io.ilss.part2.t16;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午8:40
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 如果是正常运行会显示线程被停止
         * 如果在idea上 edit configurations 中 program arguments设置-server
         * 该线程将一直执行，不停止。
         */
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("isRunning is set by false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
