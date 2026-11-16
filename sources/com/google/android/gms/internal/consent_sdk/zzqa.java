package com.google.android.gms.internal.consent_sdk;

import defpackage.p75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzqa extends zzqm implements zzrr {
    private static final zzqa zzb;
    private long zzd;
    private int zze;

    static {
        zzqa zzqaVar = new zzqa();
        zzb = zzqaVar;
        zzqm.m(zzqa.class, zzqaVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p75(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzqa();
        }
        if (i2 == 4) {
            return new zzpy(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzqa() {
    }
}
