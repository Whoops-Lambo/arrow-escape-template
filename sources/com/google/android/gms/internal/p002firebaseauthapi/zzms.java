package com.google.android.gms.internal.p002firebaseauthapi;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.d;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzms {
    public static final byte[] a = b(1, 0);
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    public static final byte[] n;
    public static final byte[] o;

    static {
        b(1, 2);
        b = b(2, 32);
        c = b(2, 16);
        d = b(2, 17);
        e = b(2, 18);
        b(2, 25722);
        f = b(2, 1);
        g = b(2, 2);
        h = b(2, 3);
        i = b(2, 1);
        j = b(2, 2);
        k = b(2, 3);
        l = new byte[0];
        Charset charset = zzqu.a;
        m = "KEM".getBytes(charset);
        n = "HPKE".getBytes(charset);
        o = "HPKE-v1".getBytes(charset);
    }

    public static byte[] b(int i2, int i3) {
        if (i2 > 4 || i2 < 0) {
            d.r("capacity must be between 0 and 4");
            return null;
        }
        if (i3 < 0 || (i2 < 4 && i3 >= (1 << (i2 << 3)))) {
            d.r("value too large");
            return null;
        }
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) (i3 >> (((i2 - i4) - 1) * 8));
        }
        return bArr;
    }

    public static int a(zzkq.zzf zzfVar) {
        if (zzfVar == zzkq.zzf.g) {
            return 32;
        }
        if (zzfVar == zzkq.zzf.d) {
            return 65;
        }
        if (zzfVar == zzkq.zzf.e) {
            return 97;
        }
        if (zzfVar == zzkq.zzf.f) {
            return Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE;
        }
        if (zzfVar == zzkq.zzf.h) {
            return 1120;
        }
        d.r("Unable to determine KEM-encoding length for ".concat(String.valueOf(zzfVar)));
        return 0;
    }

    public static int c(zzkq.zzf zzfVar) throws GeneralSecurityException {
        if (zzfVar == zzkq.zzf.g || zzfVar == zzkq.zzf.d) {
            return 32;
        }
        if (zzfVar == zzkq.zzf.e) {
            return 48;
        }
        if (zzfVar == zzkq.zzf.f) {
            return 66;
        }
        if (zzfVar == zzkq.zzf.h) {
            return 32;
        }
        e.d("Unrecognized HPKE KEM identifier");
        return 0;
    }
}
