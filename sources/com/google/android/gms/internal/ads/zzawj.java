package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzavt;
import com.google.android.gms.internal.ads.zzawz;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzaxj;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzawj {
    public static zzaxj a(final long j) {
        return zzaxj.f(new zzaxb() { // from class: rw3
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((zzaxe) obj).b.b(zzaxj.b(j));
                    return Optional.empty();
                } catch (zzawz unused) {
                    return Optional.of(zzavt.b);
                }
            }
        });
    }

    public static void b(long j, zzaxi zzaxiVar, boolean z) {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        long j10 = (((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + j8;
        long j11 = j9 % 1629190168;
        long j12 = z ? (j + j) ^ (j >> 63) : j;
        int i = 1;
        while (true) {
            long j13 = j10 ^ j11;
            long j14 = j12 >>> 7;
            boolean z2 = j14 != 0 || i < 0;
            int i2 = (int) (j12 & j13);
            if (z2) {
                i2 = ((i2 | 128) << 24) >> 24;
            }
            zzaxiVar.a.write((byte) i2);
            if (!z2) {
                return;
            }
            i++;
            j12 = j14;
        }
    }
}
