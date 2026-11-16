package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.text.TextUtils;
import defpackage.nj;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {
    public static final String a = nj.l(Plum.a, "_oversea_ad", new StringBuilder("turingfd_shark_"));
    public static String b = "";
    public static String c = "";

    public static String a(Context context) {
        char cCharAt;
        String string = "";
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        try {
            string = context.getSharedPreferences(b + a, 0).getString("g", "");
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(string)) {
            c = string;
            return string;
        }
        StringBuilder sb = new StringBuilder("03");
        Locale locale = Locale.SIMPLIFIED_CHINESE;
        sb.append(String.format(locale, "%02d", 2));
        String str = String.format(locale, "%04d", 92);
        sb.append(str.substring(str.length() - 2));
        sb.append(new SimpleDateFormat("yyMMddHHmmss", Locale.getDefault()).format(new java.util.Date()));
        if (str.length() > 2) {
            sb.append(str.substring(0, 2));
        } else {
            sb.append("00");
        }
        sb.append(String.format(locale, "%010d", Long.valueOf((long) (Math.random() * 1.0E10d))));
        sb.append((char) ((Math.random() % 10.0d) + 48.0d));
        String string2 = sb.toString();
        int length = string2.length() - 1;
        int i = 0;
        while (true) {
            cCharAt = '0';
            if (length <= 0) {
                int i2 = 0;
                for (int length2 = string2.length() - 2; length2 >= 0; length2 -= 2) {
                    char cCharAt2 = string2.charAt(length2);
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i2 += cCharAt2 - '0';
                }
                cCharAt = String.valueOf((10 - ((i + i2) % 10)) % 10).charAt(0);
                break;
            }
            char cCharAt3 = string2.charAt(length);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                break;
            }
            int i3 = (cCharAt3 - '0') * 2;
            if (i3 > 9) {
                i3 -= 9;
            }
            i += i3;
            length -= 2;
        }
        sb.append(cCharAt);
        a(context, sb.toString());
        return c;
    }

    public static void a(Context context, String str) {
        try {
            c = str;
            context.getSharedPreferences(b + a, 0).edit().putString("g", str).commit();
        } catch (Throwable unused) {
        }
    }
}
