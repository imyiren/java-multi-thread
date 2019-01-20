package io.ilss.part7.format_ok_2;

import java.text.SimpleDateFormat;

/**
 * className DateTools
 * description DateTools
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 18:03
 */
public class DateTools {
    private static ThreadLocal<SimpleDateFormat> tl = new ThreadLocal<SimpleDateFormat>();

    public static SimpleDateFormat getSimpleDateFormat(String datePattern) {
        SimpleDateFormat sdf = null;
        sdf = tl.get();
        if (sdf == null) {
            sdf = new SimpleDateFormat(datePattern);
            tl.set(sdf);
        }
        return sdf;
    }
}
