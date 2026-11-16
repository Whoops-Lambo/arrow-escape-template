package com.bytedance.sdk.component.utils;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import defpackage.d;
import defpackage.dr0;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ct {
    private static final char[] kgy = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String kgy(File file) {
        FileInputStream fileInputStream;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            if (messageDigest == null) {
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr, 0, 8192);
                    if (i <= 0) {
                        String strKgy = kgy(messageDigest.digest());
                        try {
                            fileInputStream.close();
                            return strKgy;
                        } catch (Exception e) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "f+cqkBCoXNOJRsQ=", "Vup4vQak", 82);
                            return strKgy;
                        }
                    }
                    messageDigest.update(bArr, 0, i);
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "f+cqkBCoXNOJRsQ=", "Vup4vQak", 76);
            return null;
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception e2) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "f+cqkBCoXNOJRsQ=", "Vup4vQak", 82);
                }
            }
        }
    }

    public static String kgy(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i + i2 <= bArr.length) {
                int i3 = i2 * 2;
                char[] cArr = new char[i3];
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    byte b = bArr[i5 + i];
                    int i6 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i7 = i4 + 1;
                    char[] cArr2 = kgy;
                    cArr[i4] = cArr2[i6 >> 4];
                    i4 += 2;
                    cArr[i7] = cArr2[b & 15];
                }
                return new String(cArr, 0, i3);
            }
            dr0.b();
            return null;
        }
        d.w("bytes is null");
        return null;
    }

    public static String kgy(byte[] bArr) {
        if (bArr != null) {
            return kgy(bArr, 0, bArr.length);
        }
        d.w("bytes is null");
        return null;
    }

    public static String kgy(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    messageDigest.update(str.getBytes("UTF-8"));
                    return kgy(messageDigest.digest());
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "f+cqkBCoXNOJRsQ=", "Vup4vQak", 99);
            }
        }
        return null;
    }
}
