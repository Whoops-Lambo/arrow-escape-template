package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhuf extends zzihc implements zziij {
    private static final zzhuf zzc;
    private int zza;
    private int zzb;

    static {
        zzhuf zzhufVar = new zzhuf();
        zzc = zzhufVar;
        zzihc.z(zzhuf.class, zzhufVar);
    }

    public static zzhuf G(zzifx zzifxVar, zzigm zzigmVar) {
        return (zzhuf) zzihc.s(zzc, zzifxVar, zzigmVar);
    }

    public static zzhue H() {
        return (zzhue) zzc.v();
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

    private zzhuf() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhue(zzc);
            }
            return new zzhuf();
        }
        return new hz4(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
    }
}
