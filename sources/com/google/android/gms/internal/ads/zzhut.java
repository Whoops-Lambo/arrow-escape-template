package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhut extends zzihc implements zziij {
    private static final zzhut zzb;
    private int zza;

    static {
        zzhut zzhutVar = new zzhut();
        zzb = zzhutVar;
        zzihc.z(zzhut.class, zzhutVar);
    }

    public static zzhut F(zzifx zzifxVar, zzigm zzigmVar) {
        return (zzhut) zzihc.s(zzb, zzifxVar, zzigmVar);
    }

    public static zzhut G() {
        return zzb;
    }

    public final int E() {
        return this.zza;
    }

    private zzhut() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhus(zzb);
            }
            return new zzhut();
        }
        return new hz4(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
    }
}
