package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaxv extends zzihc implements zziij {
    private static final zzaxv zzd;
    private int zza;
    private zzaxx zzb;
    private zzaya zzc;

    static {
        zzaxv zzaxvVar = new zzaxv();
        zzd = zzaxvVar;
        zzihc.z(zzaxv.class, zzaxvVar);
    }

    private zzaxv() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzaxu(zzd);
            }
            return new zzaxv();
        }
        return new hz4(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
    }
}
