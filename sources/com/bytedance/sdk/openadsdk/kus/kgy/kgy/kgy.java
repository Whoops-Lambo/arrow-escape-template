package com.bytedance.sdk.openadsdk.kus.kgy.kgy;

import android.text.TextUtils;
import android.util.Base64;
import defpackage.nj;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kgy {
    public static String ahm(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str2 == null) {
                str2 = "";
            }
            if (str.startsWith(str2)) {
                str = str.substring(str2.length());
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new String(kgy(Base64.decode(str, 0)), StandardCharsets.UTF_8);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArtsiYhDxEmDA7lmX+w=", "cs8PthqsYcKSfthSgA==", "X+suhxqsffSUWN5Tiw==", 64);
            return null;
        }
    }

    private static byte[] kgy(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        byte[] bytes = "PAGAdSDK".getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ bytes[i % length]);
        }
        return bArr2;
    }

    public static String kgy(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strEncodeToString = Base64.encodeToString(kgy(str.getBytes(StandardCharsets.UTF_8)), 0);
        StringBuilder sb = new StringBuilder();
        if (str2 == null) {
            str2 = "";
        }
        return nj.q(sb, str2, strEncodeToString);
    }
}
