package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagy {
    public static zzaha a(zzey zzeyVar) {
        zzeyVar.G(1);
        int iO = zzeyVar.O();
        long j = zzeyVar.b;
        long j2 = iO;
        int i = iO / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jD = zzeyVar.d();
            if (jD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jD;
            jArrCopyOf2[i2] = zzeyVar.d();
            zzeyVar.G(2);
        }
        zzeyVar.G((int) ((j + j2) - ((long) zzeyVar.b)));
        return new zzaha(jArrCopyOf, jArrCopyOf2);
    }
}
