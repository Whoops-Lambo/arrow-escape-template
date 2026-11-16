package com.google.android.gms.internal.consent_sdk;

import defpackage.p75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzke extends zzqm implements zzrr {
    private static final zzke zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzke zzkeVar = new zzke();
        zzb = zzkeVar;
        zzqm.m(zzke.class, zzkeVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p75(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzke();
        }
        if (i2 == 4) {
            return new zzkd(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzke() {
    }
}
