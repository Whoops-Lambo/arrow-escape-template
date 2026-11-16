package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.uw3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzazb extends zzihc implements zziij {
    private static final zzazb zzd;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        zzazb zzazbVar = new zzazb();
        zzd = zzazbVar;
        zzihc.z(zzazb.class, zzazbVar);
    }

    private zzazb() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzaza(zzd);
            }
            return new zzazb();
        }
        return new hz4(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", uw3.h, "zzc"});
    }
}
