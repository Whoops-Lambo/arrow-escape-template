package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfsq extends zzihc implements zziij {
    private static final zzfsq zzb;
    private boolean zza;

    static {
        zzfsq zzfsqVar = new zzfsq();
        zzb = zzfsqVar;
        zzihc.z(zzfsq.class, zzfsqVar);
    }

    private zzfsq() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzfsp(zzb);
            }
            return new zzfsq();
        }
        return new hz4(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"zza"});
    }
}
