package io.ilss.part5.timer_test_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * className Run
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/18 下午9:46
 */
public class Run {


    public static void main(String[] args) throws ParseException {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("运行了，时间为" + new Date());
            }
        };
        Timer timer = new Timer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //在这个时间运行上面的定时器任务
        String dateString = "2019-01-19 23:33:00";
        Date date = sdf.parse(dateString);
        System.out.println("dateString : " + date.toLocaleString() + " CurrentDate : " + new Date().toLocaleString());
        //从date开始 每4秒执行一次
        timer.schedule(task, date, 4000);
    }
}
