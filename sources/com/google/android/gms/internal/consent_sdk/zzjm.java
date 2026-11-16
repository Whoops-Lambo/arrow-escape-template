package com.google.android.gms.internal.consent_sdk;

import defpackage.h72;
import defpackage.l71;
import defpackage.ng1;
import defpackage.nl0;
import defpackage.p75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjm extends zzqm implements zzrr {
    private static final zzjm zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzjm zzjmVar = new zzjm();
        zzb = zzjmVar;
        zzqm.m(zzjm.class, zzjmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p75(zzb, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0007᠌\u0005", new Object[]{"zzd", "zze", l71.k, "zzf", "zzg", "zzh", ng1.l, "zzi", nl0.m, "zzj", h72.f});
        }
        if (i2 == 3) {
            return new zzjm();
        }
        if (i2 == 4) {
            return new zzjh(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzjm() {
    }
}
