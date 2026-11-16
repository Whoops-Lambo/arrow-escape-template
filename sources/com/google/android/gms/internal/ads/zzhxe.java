package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhxe extends zzihc implements zziij {
    private static final zzhxe zzb;
    private int zza;

    static {
        zzhxe zzhxeVar = new zzhxe();
        zzb = zzhxeVar;
        zzihc.z(zzhxe.class, zzhxeVar);
    }

    public static zzhxe F(zzifx zzifxVar, zzigm zzigmVar) {
        return (zzhxe) zzihc.s(zzb, zzifxVar, zzigmVar);
    }

    public static zzhxe G() {
        return zzb;
    }

    public final int E() {
        return this.zza;
    }

    private zzhxe() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhxd(zzb);
            }
            return new zzhxe();
        }
        return new hz4(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
    }
}
