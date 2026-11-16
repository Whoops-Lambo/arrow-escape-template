package com.adsurge.adn.oversea_ad;

import android.text.TextUtils;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static final b a = new b();

    static {
        new SecureRandom();
    }

    public static String a(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(",:")) {
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (",:".indexOf(cCharAt) >= 0) {
                    sb.append('%');
                    sb.append(String.format("%H", Character.valueOf(cCharAt)));
                } else {
                    sb.append(cCharAt);
                }
            }
            return sb.toString();
        }
        return str;
    }

    public static String a(String str, byte[] bArr) {
        try {
            if (str == null) {
                return new String(bArr);
            }
            return new String(bArr, str);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString.toUpperCase(Locale.getDefault()));
        }
        return stringBuffer.toString();
    }
}
