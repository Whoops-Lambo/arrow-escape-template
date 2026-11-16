package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzazd extends zzihc implements zziij {
    private static final zzazd zze;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;

    static {
        zzazd zzazdVar = new zzazd();
        zze = zzazdVar;
        zzihc.z(zzazd.class, zzazdVar);
    }

    private zzazd() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzazc(zze);
            }
            return new zzazd();
        }
        return new hz4(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
    }
}
