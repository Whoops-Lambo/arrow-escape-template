package com.google.android.gms.internal.consent_sdk;

import defpackage.p75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjx extends zzqm implements zzrr {
    private static final zzjx zzb;
    private int zzd;
    private zzjw zze;

    static {
        zzjx zzjxVar = new zzjx();
        zzb = zzjxVar;
        zzqm.m(zzjx.class, zzjxVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p75(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzjx();
        }
        if (i2 == 4) {
            return new zzju(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzjx() {
    }
}
