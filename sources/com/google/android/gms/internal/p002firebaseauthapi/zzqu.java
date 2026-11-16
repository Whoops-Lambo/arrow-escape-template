package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Build;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzqu {
    public static final Charset a = Charset.forName("UTF-8");

    public static boolean a(zzch zzchVar) {
        for (int i = 0; i < zzchVar.zza(); i++) {
            zzcd zzcdVarZza = zzchVar.zza(i);
            if (zzcdVarZza.e && zzcdVarZza.c.equals(zzbv.b)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static Integer c() {
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }
}
