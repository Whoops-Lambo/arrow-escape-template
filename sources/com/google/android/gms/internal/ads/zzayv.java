package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzayv extends zzihc implements zziij {
    private static final zzayv zzc;
    private int zza;
    private long zzb = -1;

    static {
        zzayv zzayvVar = new zzayv();
        zzc = zzayvVar;
        zzihc.z(zzayv.class, zzayvVar);
    }

    private zzayv() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzayu(zzc);
            }
            return new zzayv();
        }
        return new hz4(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zza", "zzb"});
    }
}
