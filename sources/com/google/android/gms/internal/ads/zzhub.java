package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhub extends zzihc implements zziij {
    private static final zzhub zzc;
    private int zza;
    private int zzb;

    static {
        zzhub zzhubVar = new zzhub();
        zzc = zzhubVar;
        zzihc.z(zzhub.class, zzhubVar);
    }

    public static zzhub G(zzifx zzifxVar, zzigm zzigmVar) {
        return (zzhub) zzihc.s(zzc, zzifxVar, zzigmVar);
    }

    public static zzhua H() {
        return (zzhua) zzc.v();
    }

    public final int E() {
        return this.zza;
    }

    public final int F() {
        return this.zzb;
    }

    public final /* synthetic */ void I(int i) {
        this.zza = i;
    }

    private zzhub() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhua(zzc);
            }
            return new zzhub();
        }
        return new hz4(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
    }
}
