package com.google.android.gms.internal.consent_sdk;

import defpackage.p75;
import defpackage.xl1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjz extends zzqm implements zzrr {
    private static final zzjz zzb;
    private int zzd;
    private int zze;
    private zzjx zzf;

    static {
        zzjz zzjzVar = new zzjz();
        zzb = zzjzVar;
        zzqm.m(zzjz.class, zzjzVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p75(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", xl1.i, "zzf"});
        }
        if (i2 == 3) {
            return new zzjz();
        }
        if (i2 == 4) {
            return new zzjt(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzjz() {
    }
}
