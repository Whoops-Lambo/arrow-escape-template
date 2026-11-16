package com.tiktok.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class RegexUtil {
    public static boolean validateAppId(String str) {
        try {
            return Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]*(\\.[a-zA-Z][a-zA-Z0-9_]*)+$").matcher(str).matches();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean validateTTAppId(String str) {
        try {
            return Pattern.compile("^(\\d+,)*\\d+$").matcher(str).matches();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String replaceAllToHash(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile(str).matcher(str2);
                while (matcher.find()) {
                    matcher.appendReplacement(stringBuffer, DecryptUtil.toSha256(matcher.group()));
                }
                matcher.appendTail(stringBuffer);
                return stringBuffer.toString();
            }
            return str2;
        } catch (Throwable unused) {
            return "";
        }
    }
}
