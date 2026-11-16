package com.adsurge.adn.oversea_ad;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Haw {
    public static Guava b(int i) {
        String strA;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        try {
            strA = a(i);
            try {
                if (i != -1) {
                    str2 = new String(Dorado.a(String.format(Locale.SIMPLIFIED_CHINESE, "/proc/%d/status", Integer.valueOf(i))));
                } else {
                    Locale locale = Locale.SIMPLIFIED_CHINESE;
                    str2 = new String(Dorado.a("/proc/self/status"));
                }
                HashMap map = new HashMap();
                for (String str3 : str2.split("\n")) {
                    String[] strArrSplit = str3.split(":");
                    if (strArrSplit.length >= 2) {
                        map.put(strArrSplit[0].trim(), strArrSplit[1].trim());
                    }
                }
                i2 = Integer.parseInt((String) map.get("PPid"));
                try {
                    i3 = Integer.parseInt(((String) map.get("Uid")).split("\\s+")[0]);
                    try {
                        i4 = Integer.parseInt((String) map.get("TracerPid"));
                    } catch (Throwable unused) {
                        i4 = -1;
                    }
                } catch (Throwable unused2) {
                    i3 = -1;
                }
            } catch (Throwable unused3) {
                i2 = -1;
                i3 = -1;
                i4 = -1;
                str = strA;
                int i5 = i2;
                int i6 = i3;
                if (str != null) {
                }
                return null;
            }
        } catch (Throwable unused4) {
            strA = null;
        }
        str = strA;
        int i7 = i2;
        int i8 = i3;
        if (str != null || i7 == -1 || i8 == -1) {
            return null;
        }
        return new Guava(i, i7, str, i8, i4);
    }

    public static String a(int i) {
        String str;
        byte[] bArrA;
        int i2;
        try {
            Locale locale = Locale.SIMPLIFIED_CHINESE;
            byte[] bArrA2 = Dorado.a(String.format(locale, "/proc/%d/cmdline", Integer.valueOf(i)), 100);
            int i3 = 0;
            if (bArrA2 != null) {
                int i4 = -1;
                while (true) {
                    i2 = i4 + 1;
                    if (i4 >= bArrA2.length) {
                        i2 = 0;
                        break;
                    }
                    if (i2 == bArrA2.length || bArrA2[i2] == 0) {
                        break;
                        break;
                    }
                    i4 = i2;
                }
                str = new String(bArrA2, 0, i2);
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str) || (bArrA = Dorado.a(String.format(locale, "/proc/%d/status", Integer.valueOf(i)), 150)) == null) {
                return str;
            }
            int i5 = 6;
            while (true) {
                int i6 = i5 + 1;
                if (i5 < bArrA.length) {
                    if (i6 != bArrA.length && bArrA[i6] != 10) {
                        i5 = i6;
                    }
                    i3 = i6;
                    break;
                }
                break;
            }
            return i3 == 0 ? "" : new String(bArrA, 6, i3 - 6);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
