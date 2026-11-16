package com.google.android.gms.internal.consent_sdk;

import defpackage.p75;
import defpackage.xl1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zziq extends zzqm implements zzrr {
    private static final zziq zzb;
    private int zzd;
    private int zze;
    private zzik zzf;
    private zzip zzg;

    static {
        zziq zziqVar = new zziq();
        zzb = zziqVar;
        zzqm.m(zziq.class, zziqVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p75(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", xl1.h, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zziq();
        }
        if (i2 == 4) {
            return new zzii(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zziq() {
    }
}
