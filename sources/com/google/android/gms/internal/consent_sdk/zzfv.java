package com.google.android.gms.internal.consent_sdk;

import defpackage.k92;
import defpackage.p75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfv extends zzqm implements zzrr {
    private static final zzfv zzb;
    private int zzd;
    private int zze;

    static {
        zzfv zzfvVar = new zzfv();
        zzb = zzfvVar;
        zzqm.m(zzfv.class, zzfvVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p75(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", k92.f});
        }
        if (i2 == 3) {
            return new zzfv();
        }
        if (i2 == 4) {
            return new zzfs(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzfv() {
    }
}
