package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfsh extends zzihc implements zziij {
    private static final zzfsh zzc;
    private int zza;
    private String zzb = "";

    static {
        zzfsh zzfshVar = new zzfsh();
        zzc = zzfshVar;
        zzihc.z(zzfsh.class, zzfshVar);
    }

    private zzfsh() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzfsg(zzc);
            }
            return new zzfsh();
        }
        return new hz4(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"zza", "zzb"});
    }
}
