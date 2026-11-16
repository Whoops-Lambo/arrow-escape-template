package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfti extends zzihc implements zziij {
    private static final zzfti zze;
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;

    static {
        zzfti zzftiVar = new zzfti();
        zze = zzftiVar;
        zzihc.z(zzfti.class, zzftiVar);
    }

    private zzfti() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzfth(zze);
            }
            return new zzfti();
        }
        return new hz4(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\f\u0004\u0007", new Object[]{"zza", "zzb", "zzc", "zzd"});
    }
}
