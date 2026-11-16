package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.wy4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzink extends zzihc implements zziij {
    private static final zzink zzd;
    private int zza;
    private String zzb = "";
    private zzihk zzc = wy4.e;

    static {
        zzink zzinkVar = new zzink();
        zzd = zzinkVar;
        zzihc.z(zzink.class, zzinkVar);
    }

    private zzink() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzinj(zzd);
            }
            return new zzink();
        }
        return new hz4(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u0016", new Object[]{"zza", "zzb", "zzc"});
    }
}
