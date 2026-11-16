package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzikn extends zzihc implements zziij {
    private static final zzikn zzd;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        zzikn zziknVar = new zzikn();
        zzd = zziknVar;
        zzihc.z(zzikn.class, zziknVar);
    }

    public static zzikm E() {
        return (zzikm) zzd.v();
    }

    private zzikn() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzikm(zzd);
            }
            return new zzikn();
        }
        return new hz4(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
    }
}
