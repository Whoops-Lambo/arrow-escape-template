package com.google.android.gms.internal.consent_sdk;

import defpackage.p75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzlt extends zzqm implements zzrr {
    private static final zzlt zzb;

    static {
        zzlt zzltVar = new zzlt();
        zzb = zzltVar;
        zzqm.m(zzlt.class, zzltVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p75(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new zzlt();
        }
        if (i2 == 4) {
            return new zzls(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzlt() {
    }
}
