package com.tiktok.util;

import android.annotation.SuppressLint;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class TimeUtil {

    @SuppressLint({"ConstantLocale"})
    private static final DateFormat sFormate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static boolean isNowAfter(String str, int i) {
        try {
            return dateStr(-i).equals(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getISO8601Timestamp(Date date) {
        try {
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            DateFormat dateFormat = sFormate;
            dateFormat.setTimeZone(timeZone);
            return dateFormat.format(date);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String dateStr(int i) {
        try {
            Calendar calendar = Calendar.getInstance();
            if (i != 0) {
                calendar.add(5, i);
            }
            return sdf.format(calendar.getTime());
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getISO8601Timestamp() {
        try {
            return getISO8601Timestamp(new Date());
        } catch (Throwable unused) {
            return "";
        }
    }
}
