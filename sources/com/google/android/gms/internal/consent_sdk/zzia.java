package com.google.android.gms.internal.consent_sdk;

import defpackage.l71;
import defpackage.p75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzia extends zzqm implements zzrr {
    private static final zzia zzb;
    private int zzd;
    private int zze;

    static {
        zzia zziaVar = new zzia();
        zzb = zziaVar;
        zzqm.m(zzia.class, zziaVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p75(zzb, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0000", new Object[]{"zzd", "zze", l71.j});
        }
        if (i2 == 3) {
            return new zzia();
        }
        if (i2 == 4) {
            return new zzhy(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzia() {
    }
}
