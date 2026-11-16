package com.adsurge.adn.I0;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static Pair a(long j) {
        double d;
        String str = "B";
        if (j <= 0) {
            return new Pair("0", "B");
        }
        if (j < 1000) {
            d = j;
        } else if (j < 1000000) {
            d = j / 1000.0d;
            str = "KB";
        } else if (j < 1000000000) {
            d = j / 1000000.0d;
            str = "MB";
        } else {
            d = j / 1.0E9d;
            str = "GB";
        }
        return new Pair(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d)), str);
    }

    public static String a(String str, String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                if (str != null && i != 0) {
                    stringBuffer.append(str);
                }
                stringBuffer.append(strArr[i]);
            }
        }
        return stringBuffer.toString();
    }

    public static int a(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Charset charset = com.adsurge.adn.B0.a.a;
        return new String(Base64.decode(str.getBytes(charset), 10), charset);
    }
}
