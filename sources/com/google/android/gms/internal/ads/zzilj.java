package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.uw3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzilj extends zzihc implements zziij {
    private static final zzilj zzf;
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    static {
        zzilj zziljVar = new zzilj();
        zzf = zziljVar;
        zzihc.z(zzilj.class, zziljVar);
    }

    private zzilj() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzilh(zzf);
            }
            return new zzilj();
        }
        return new hz4(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", uw3.D, "zzc", uw3.C, "zzd", "zze"});
    }
}
