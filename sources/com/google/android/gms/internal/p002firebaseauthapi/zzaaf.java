package com.google.android.gms.internal.p002firebaseauthapi;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaaf {
    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static byte[] b(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                int iDigit = Character.digit(str.charAt(i2), 16);
                int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
                if (iDigit != -1 && iDigit2 != -1) {
                    bArr[i] = (byte) ((iDigit << 4) + iDigit2);
                } else {
                    d.r("input is not hexadecimal");
                    return null;
                }
            }
            return bArr;
        }
        d.r("Expected a string of even length");
        return null;
    }
}
