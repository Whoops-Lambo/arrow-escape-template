package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfsl extends zzihc implements zziij {
    private static final zzfsl zzc;
    private String zza = "";
    private int zzb;

    static {
        zzfsl zzfslVar = new zzfsl();
        zzc = zzfslVar;
        zzihc.z(zzfsl.class, zzfslVar);
    }

    private zzfsl() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzfsk(zzc);
            }
            return new zzfsl();
        }
        return new hz4(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"zza", "zzb"});
    }
}
