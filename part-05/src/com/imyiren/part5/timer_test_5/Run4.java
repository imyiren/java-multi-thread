package com.imyiren.part5.timer_test_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * className Run4
 * description Run4
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 12:18
 */
public class Run4 {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            private int count = 0;

            @Override
            public void run() {
                System.out.println("1 Begin 运行了，时间为" + new Date());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("1   End 运行了，时间为" + new Date());
                count++;
                if (count == 5) {
                    timer.cancel();
                }
            }
        };
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //在这个时间运行上面的定时器任务
        String dateString1 = "2019-01-19 23:33:00";
        Date date1 = sdf.parse(dateString1);
        System.out.println("dateString 1 : " + date1.toLocaleString() + " CurrentDate : " + new Date().toLocaleString());
        //从date开始 每4秒执行一次 如果计划遭遇当前时间则立即执行
        timer.scheduleAtFixedRate(task, date1, 2000);
        //如果被延迟，则下次开始时间则是上次结束的时间为开始时间。
    }
}
