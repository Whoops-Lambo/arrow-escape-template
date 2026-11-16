package com.google.android.gms.internal.consent_sdk;

import defpackage.p75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzkr extends zzqm implements zzrr {
    private static final zzkr zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private boolean zzg;

    static {
        zzkr zzkrVar = new zzkr();
        zzb = zzkrVar;
        zzqm.m(zzkr.class, zzkrVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p75(zzb, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzkm.class, zzkq.class});
        }
        if (i2 == 3) {
            return new zzkr();
        }
        if (i2 == 4) {
            return new zzkk(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzkr() {
    }
}
