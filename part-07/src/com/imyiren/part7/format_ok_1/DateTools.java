package com.imyiren.part7.format_ok_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * className DateTools
 * description DateTools
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 18:00
 */
public class DateTools {
    public static Date parse(String formatPattern, String dateString)
            throws ParseException {
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }

    public static String format(String formatPattern, Date date) {
        return new SimpleDateFormat(formatPattern).format(date).toString();
    }
}
