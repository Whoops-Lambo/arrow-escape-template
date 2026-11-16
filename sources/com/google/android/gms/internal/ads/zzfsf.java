package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfsf extends zzihc implements zziij {
    private static final zzfsf zzb;
    private String zza = "";

    static {
        zzfsf zzfsfVar = new zzfsf();
        zzb = zzfsfVar;
        zzihc.z(zzfsf.class, zzfsfVar);
    }

    private zzfsf() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzfse(zzb);
            }
            return new zzfsf();
        }
        return new hz4(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
    }
}
