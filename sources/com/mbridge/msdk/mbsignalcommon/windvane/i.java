package com.mbridge.msdk.mbsignalcommon.windvane;

import android.net.Uri;
import android.text.TextUtils;
import com.singular.sdk.internal.UserDetailsUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class i {
    private static final String[] a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};
    private static final Pattern b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");
    private static final Pattern c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");
    private static final Pattern d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");
    private static final Pattern e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");
    private static Map<String, String> f = new HashMap();

    public static String a(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 255) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        stringBuffer.append(cCharAt);
                        break;
                    }
                    if (cArr[i2] == cCharAt) {
                        stringBuffer.append("\\" + cCharAt);
                        break;
                    }
                    i2++;
                }
            } else {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(cCharAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(cCharAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase2);
            }
        }
        return new String(stringBuffer);
    }

    static {
        for (d dVar : d.values()) {
            f.put(dVar.g(), dVar.f());
        }
    }

    public static Pattern c(String str) {
        if ("wv_hybrid:".equals(str)) {
            return e;
        }
        if ("mraid:".equals(str)) {
            return c;
        }
        if ("ssp:".equals(str)) {
            return d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return e;
        }
        return null;
    }

    public static boolean f(String str) {
        for (String str2 : a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String b(String str) {
        String str2 = f.get(d(str));
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static String d(String str) {
        String path;
        int iLastIndexOf;
        if (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (iLastIndexOf = path.lastIndexOf(UserDetailsUtils.UserDetailsLiterals.DOT)) == -1) {
            return "";
        }
        return path.substring(iLastIndexOf + 1);
    }

    public static boolean e(String str) {
        return b(str).startsWith("image");
    }
}
