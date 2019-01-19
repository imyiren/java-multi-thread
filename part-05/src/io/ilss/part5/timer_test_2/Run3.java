package io.ilss.part5.timer_test_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * className Run3
 * description Run3
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-19 23:44
 */
public class Run3 {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();
        TimerTask task1 = new TimerTask() {
            private int count = 0;
            @Override
            public void run() {
                System.out.println("A 运行了，时间为" + new Date());
                count++;
                //当执行到第五次A的时候取消timer到任务
                if (count == 5) {
                    timer.cancel();
                }
            }
        };
        TimerTask task2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("B 运行了，时间为" + new Date());
            }
        };
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //在这个时间运行上面的定时器任务
        String dateString = "2019-01-19 23:33:00";
        Date date = sdf.parse(dateString);
        System.out.println("dateString : " + date.toLocaleString() + " CurrentDate : " + new Date().toLocaleString());
        //从date开始 每4秒执行一次 如果计划早于当前时间则立即执行
        timer.schedule(task1, date, 4000);
        timer.schedule(task2, date, 4000);

    }
}
