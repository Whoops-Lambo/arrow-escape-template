package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzasf {
    public static long a(zzey zzeyVar, int i, int i2) {
        zzeyVar.E(i);
        if (zzeyVar.B() >= 5) {
            int iB = zzeyVar.b();
            if ((8388608 & iB) == 0 && ((iB >> 8) & 8191) == i2 && (iB & 32) != 0 && zzeyVar.K() >= 7 && zzeyVar.B() >= 7 && (zzeyVar.K() & 16) == 16) {
                byte[] bArr = new byte[6];
                zzeyVar.H(0, 6, bArr);
                long j = bArr[0];
                long j2 = bArr[1];
                long j3 = bArr[2];
                long j4 = bArr[3] & 255;
                return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((((long) bArr[4]) & 255) >> 7);
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }
}
