package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.wz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzimr extends zzihc implements zziij {
    private static final zzimr zzd;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzimr zzimrVar = new zzimr();
        zzd = zzimrVar;
        zzihc.z(zzimr.class, zzimrVar);
    }

    private zzimr() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzimp(zzd);
            }
            return new zzimr();
        }
        wz4 wz4Var = wz4.g;
        return new hz4(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", wz4Var, "zzc", wz4Var});
    }
}
