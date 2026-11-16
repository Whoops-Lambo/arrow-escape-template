package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfss extends zzihc implements zziij {
    private static final zzfss zze;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        zzfss zzfssVar = new zzfss();
        zze = zzfssVar;
        zzihc.z(zzfss.class, zzfssVar);
    }

    private zzfss() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzfsr(zze);
            }
            return new zzfss();
        }
        return new hz4(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
    }
}
