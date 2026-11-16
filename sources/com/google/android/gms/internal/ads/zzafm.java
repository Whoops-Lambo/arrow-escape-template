package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafm {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
    
        if (r12 != 3) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzafl a(com.google.android.gms.internal.ads.zzet r12, boolean r13) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafm.a(com.google.android.gms.internal.ads.zzet, boolean):com.google.android.gms.internal.ads.zzafl");
    }

    public static int b(zzet zzetVar) throws zzat {
        int iH = zzetVar.h(4);
        if (iH == 15) {
            if (zzetVar.b() >= 24) {
                return zzetVar.h(24);
            }
            throw zzat.b("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return a[iH];
        }
        throw zzat.b("AAC header wrong Sampling Frequency Index", null);
    }
}
