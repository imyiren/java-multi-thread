package io.ilss.part2.t5;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/13 下午1:28
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        ThreadA aThread = new ThreadA(task);
        ThreadB bThread = new ThreadB(task);
        aThread.start();
        bThread.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommonUtil.beginTime1 < CommonUtil.beginTime2 ? CommonUtil.beginTime1 : CommonUtil.beginTime2;
        long endTime = CommonUtil.endTime1 < CommonUtil.endTime2 ? CommonUtil.endTime2 : CommonUtil.endTime1;
        System.out.println("耗时： " + (endTime - beginTime) / 1000 + "s");

    }
}
