package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfrg extends zzihc implements zziij {
    private static final zzfrg zzc;
    private int zza;
    private long zzb;

    static {
        zzfrg zzfrgVar = new zzfrg();
        zzc = zzfrgVar;
        zzihc.z(zzfrg.class, zzfrgVar);
    }

    public static zzfrf E() {
        return (zzfrf) zzc.v();
    }

    public final /* synthetic */ void F(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void G(int i) {
        this.zza = i - 2;
    }

    private zzfrg() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzfrf(zzc);
            }
            return new zzfrg();
        }
        return new hz4(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
    }
}
