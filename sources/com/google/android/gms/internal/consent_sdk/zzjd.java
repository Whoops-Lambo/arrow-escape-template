package com.google.android.gms.internal.consent_sdk;

import defpackage.p75;
import defpackage.t40;
import defpackage.uf0;
import defpackage.xb2;
import defpackage.xw0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjd extends zzqm implements zzrr {
    private static final zzjd zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzjd zzjdVar = new zzjd();
        zzb = zzjdVar;
        zzqm.m(zzjd.class, zzjdVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p75(zzb, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005᠌\u0005\u0006င\u0002\t᠌\u0006\n᠌\u0007", new Object[]{"zzd", "zze", t40.i, "zzf", "zzh", "zzi", "zzj", xb2.h, "zzg", "zzk", uf0.f, "zzl", xw0.e});
        }
        if (i2 == 3) {
            return new zzjd();
        }
        if (i2 == 4) {
            return new zziy(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzjd() {
    }
}
