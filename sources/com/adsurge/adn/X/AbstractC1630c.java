package com.adsurge.adn.X;

import android.content.Context;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.adsurge.adn.X.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC1630c {
    public static volatile String a;
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(Signature[] signatureArr) {
        if (signatureArr != null && signatureArr.length != 0) {
            try {
                int length = signatureArr.length;
                StringBuilder sb = new StringBuilder();
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                for (int i = 0; i < length; i++) {
                    sb.append(a(messageDigest.digest(signatureArr[i].toByteArray())));
                    if (i != length - 1) {
                        sb.append(";");
                    }
                }
                return sb.toString();
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return "";
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        try {
            a = a(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures);
            return a;
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = b;
            cArr[i2] = cArr2[(b2 >>> 4) & 15];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }
}
