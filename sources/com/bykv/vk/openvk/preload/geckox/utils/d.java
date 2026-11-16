package com.bykv.vk.openvk.preload.geckox.utils;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import defpackage.dr0;
import defpackage.nj;
import defpackage.pv1;
import defpackage.vq2;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void a(InputStream inputStream, String str) throws Exception {
        if (str == null) {
            y.j("md5 check failed: md5 == null");
            return;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            try {
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStream.read(bArr, 0, 4096);
                        if (i == -1) {
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i);
                        }
                        CloseableUtils.close(inputStream);
                        throw th;
                    }
                    CloseableUtils.close(inputStream);
                    try {
                        byte[] bArrDigest = messageDigest.digest();
                        String strA = a(bArrDigest, bArrDigest.length);
                        if (str.equals(strA)) {
                            return;
                        }
                        y.j(pv1.o("md5 check failed file: local md5:", strA, " expect md5:", str));
                    } catch (Exception e) {
                        vq2.n(nj.o(e, new StringBuilder("md5 check failed:")), e);
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("md5 check failed:" + e2.getMessage(), e2);
                }
            } catch (Throwable th) {
                CloseableUtils.close(inputStream);
                throw th;
            }
        } catch (Exception e3) {
            vq2.n(nj.o(e3, new StringBuilder("md5 check failed:")), e3);
        }
    }

    private static String a(byte[] bArr, int i) {
        if (bArr != null) {
            if (i <= bArr.length) {
                int i2 = i << 1;
                char[] cArr = new char[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    byte b = bArr[i4];
                    int i5 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i6 = i3 + 1;
                    char[] cArr2 = a;
                    cArr[i3] = cArr2[i5 >> 4];
                    i3 += 2;
                    cArr[i6] = cArr2[b & 15];
                }
                return new String(cArr, 0, i2);
            }
            dr0.b();
            return null;
        }
        defpackage.d.w("bytes is null");
        return null;
    }
}
