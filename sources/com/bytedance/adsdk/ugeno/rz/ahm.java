package com.bytedance.adsdk.ugeno.rz;

import android.os.Build;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ahm {
    public static List<rz> ahm(BigDecimal bigDecimal, String str, Locale locale, int i, int i2, int i3) {
        Locale locale2;
        List<rz> listAhm;
        if (bigDecimal == null || TextUtils.isEmpty(str) || locale == null) {
            return Collections.EMPTY_LIST;
        }
        String upperCase = str.trim().toUpperCase(Locale.ROOT);
        if (Build.VERSION.SDK_INT >= 30) {
            locale2 = locale;
            listAhm = uq.ahm(bigDecimal, upperCase, locale2, i, i2, i3);
        } else {
            locale2 = locale;
            listAhm = kgy.ahm(bigDecimal, upperCase, locale2, i, i2, i3);
        }
        if (kgy(locale2)) {
            for (int i4 = 0; i4 < listAhm.size(); i4++) {
                rz rzVar = listAhm.get(i4);
                String strKgy = kgy(rzVar.ahm());
                if (!strKgy.equals(rzVar.ahm())) {
                    listAhm.set(i4, new rz(rzVar.kgy(), strKgy, rzVar.rz(), rzVar.uq()));
                }
            }
        }
        return listAhm;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    private static String kgy(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                int numericValue = Character.getNumericValue(c);
                if (numericValue < 0 || numericValue > 9) {
                    sb.append(c);
                } else {
                    sb.append((char) (numericValue + 48));
                }
            } else if (c == 1644) {
                sb.append(',');
            } else if (c == 1643) {
                sb.append('.');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static boolean kgy(Locale locale) {
        if (locale == null) {
            return false;
        }
        return "ar".equalsIgnoreCase(locale.getLanguage());
    }

    public static String kgy(BigDecimal bigDecimal, String str, Locale locale, int i, int i2, int i3) {
        Locale locale2;
        String strKgy;
        if (bigDecimal != null && !TextUtils.isEmpty(str) && locale != null) {
            String upperCase = str.trim().toUpperCase(Locale.ROOT);
            if (Build.VERSION.SDK_INT >= 30) {
                locale2 = locale;
                strKgy = uq.kgy(bigDecimal, upperCase, locale2, i, i2, i3);
            } else {
                locale2 = locale;
                strKgy = kgy.kgy(bigDecimal, upperCase, locale2, i, i2, i3);
            }
            return kgy(locale2) ? kgy(strKgy) : strKgy;
        }
        return "";
    }
}
