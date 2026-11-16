package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.wz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzimb extends zzihc implements zziij {
    private static final zzimb zzf;
    private int zza;
    private int zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zzimb zzimbVar = new zzimb();
        zzf = zzimbVar;
        zzihc.z(zzimb.class, zzimbVar);
    }

    private zzimb() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzilz(zzf);
            }
            return new zzimb();
        }
        return new hz4(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", wz4.b, "zzc", "zzd", "zze"});
    }
}
