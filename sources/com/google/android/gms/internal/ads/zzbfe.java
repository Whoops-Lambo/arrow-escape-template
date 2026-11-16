package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbfe extends zzihc implements zziij {
    private static final zzbfe zzd;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzbfe zzbfeVar = new zzbfe();
        zzd = zzbfeVar;
        zzihc.z(zzbfe.class, zzbfeVar);
    }

    public static zzbfe G() {
        return zzd;
    }

    public final int E() {
        return this.zzb;
    }

    public final int F() {
        return this.zzc;
    }

    private zzbfe() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzbfd(zzd);
            }
            return new zzbfe();
        }
        return new hz4(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zza", "zzb", "zzc"});
    }
}
