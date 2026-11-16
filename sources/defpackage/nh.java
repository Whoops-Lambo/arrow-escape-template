package defpackage;

import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class nh {
    public static String b(String str) throws sg0 {
        Pattern patternCompile = Pattern.compile("[0-1]+");
        patternCompile.getClass();
        int length = str.length() % 24;
        if (length > 0) {
            str = n30.m(str, kk2.H(24 - length, "0"));
        }
        int i = 0;
        int iN = vk3.n(0, str.length() - 1, 6);
        String str2 = "";
        if (iN < 0) {
            return "";
        }
        while (true) {
            int i2 = i + 6;
            String strSubstring = str.substring(i, i2);
            if (!patternCompile.matcher(strSubstring).matches()) {
                throw new sg0("Invalid bitField");
            }
            ns1.d(2);
            str2 = str2 + "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(Integer.parseInt(strSubstring, 2));
            if (i == iN) {
                return str2;
            }
            i = i2;
        }
    }

    public static String a(String str) {
        str.getClass();
        try {
            int length = str.length();
            String str2 = "";
            for (int i = 0; i < length; i++) {
                Integer num = (Integer) ((Map) oh.a.getValue()).get(String.valueOf(str.charAt(i)));
                if (num != null) {
                    int iIntValue = num.intValue();
                    ns1.d(2);
                    String string = Integer.toString(iIntValue, 2);
                    string.getClass();
                    str2 = str2 + kk2.H(6 - string.length(), "0") + string;
                } else {
                    throw new a60("Invalid value on index " + i);
                }
            }
            return str2;
        } catch (Exception unused) {
            throw new a60("Invalid encoded Base64URL string");
        }
    }
}
