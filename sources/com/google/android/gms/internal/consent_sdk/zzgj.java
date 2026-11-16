package com.google.android.gms.internal.consent_sdk;

import defpackage.l71;
import defpackage.nl0;
import defpackage.p75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzgj extends zzqm implements zzrr {
    private static final zzgj zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgj zzgjVar = new zzgj();
        zzb = zzgjVar;
        zzqm.m(zzgj.class, zzgjVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p75(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", nl0.k, "zzf", l71.i});
        }
        if (i2 == 3) {
            return new zzgj();
        }
        if (i2 == 4) {
            return new zzgh(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzgj() {
    }
}
