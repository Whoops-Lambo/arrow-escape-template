package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbep extends zzihc implements zziij {
    private static final zzbep zzc;
    private int zza;
    private zzaxn zzb;

    static {
        zzbep zzbepVar = new zzbep();
        zzc = zzbepVar;
        zzihc.z(zzbep.class, zzbepVar);
    }

    public static zzbeo E() {
        return (zzbeo) zzc.v();
    }

    public final /* synthetic */ void F(zzaxn zzaxnVar) {
        this.zzb = zzaxnVar;
        this.zza |= 1;
    }

    private zzbep() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzbeo(zzc);
            }
            return new zzbep();
        }
        return new hz4(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
    }
}
