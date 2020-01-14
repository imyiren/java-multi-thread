package com.imyiren.part5.timer_test_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * className Run1
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午9:46
 */
public class Run1 {
    private static Timer timer = new Timer();

    public static void main(String[] args) throws ParseException {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("运行了，时间为" + new Date());
            }
        };
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //在这个时间运行上面的定时器任务
        String dateString = "2019-01-19 22:48:00";
        Date date = sdf.parse(dateString);
        System.out.println("dateString : " + date.toLocaleString() + " CurrentDate : " + new Date().toLocaleString());
        timer.schedule(task, date);
    }
}
