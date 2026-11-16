package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaxr extends zzihc implements zziij {
    private static final zzaxr zzd;
    private int zza;
    private String zzb = "";
    private String zzc = "";

    static {
        zzaxr zzaxrVar = new zzaxr();
        zzd = zzaxrVar;
        zzihc.z(zzaxr.class, zzaxrVar);
    }

    private zzaxr() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzaxq(zzd);
            }
            return new zzaxr();
        }
        return new hz4(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", "zzc"});
    }
}
