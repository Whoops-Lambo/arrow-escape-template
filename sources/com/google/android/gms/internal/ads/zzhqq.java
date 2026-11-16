package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhqq {
    public static final /* synthetic */ int a = 0;

    public static boolean a(byte[] bArr, byte[] bArr2) {
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

    public static boolean b(zzhgo zzhgoVar) {
        for (int i = 0; i < zzhgoVar.zzd(); i++) {
            zzhgl zzhglVarD = ((zzhgn) zzhgoVar).d(i);
            if (zzhglVarD.d && zzhglVarD.b == zzhge.b) {
                return true;
            }
        }
        return false;
    }

    static {
        Charset.forName("UTF-8");
    }
}
