package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfsn extends zzihc implements zziij {
    private static final zzfsn zzb;
    private String zza = "";

    static {
        zzfsn zzfsnVar = new zzfsn();
        zzb = zzfsnVar;
        zzihc.z(zzfsn.class, zzfsnVar);
    }

    private zzfsn() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzfsm(zzb);
            }
            return new zzfsn();
        }
        return new hz4(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
    }
}
