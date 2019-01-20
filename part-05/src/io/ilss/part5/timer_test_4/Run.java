package io.ilss.part5.timer_test_4;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * className Run
 * description Run
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 12:08
 */
public class Run {
    public static void main(String[] args) {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("运行了，时间为" + new Date());
            }
        };
        Timer timer = new Timer();
        System.out.println("CurrentDate : " + new Date().toLocaleString());
        //当前时间过多少ms过后执行任务,period多少时间执行一次
        timer.schedule(task, 3000, 4000);
    }
}
