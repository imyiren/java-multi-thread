package com.imyiren.part5.timer_test_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * className Run2Later
 * description Run2Later
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-19 23:20
 */
public class Run2Later {
    private static Timer timer = new Timer();
    public static void main(String[] args) throws ParseException {
        TimerTask task1 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Begin ， time： " + new Date());
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("  End ， time： " + new Date());
            }
        };
        TimerTask task2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("运行了， 时间为： " + new Date());
            }
        };
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString1 = "2019-01-19 23:22:00";
        String dateString2 = "2019-01-19 23:22:10";
        Date date1 = sdf1.parse(dateString1);
        Date date2 = sdf2.parse(dateString2);
        System.out.println("dateString1 : " + date1.toLocaleString() + " CurrentDate : " + new Date().toLocaleString());
        System.out.println("dateString2 : " + date2.toLocaleString() + " CurrentDate : " + new Date().toLocaleString());
        timer.schedule(task1, date1);
        timer.schedule(task2, date2);

    }
}
