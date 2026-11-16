package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhuj extends zzihc implements zziij {
    private static final zzhuj zza;

    static {
        zzhuj zzhujVar = new zzhuj();
        zza = zzhujVar;
        zzihc.z(zzhuj.class, zzhujVar);
    }

    public static void E(zzifx zzifxVar, zzigm zzigmVar) {
    }

    public static zzhuj F() {
        return zza;
    }

    private zzhuj() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhui(zza);
            }
            return new zzhuj();
        }
        return new hz4(zza, "\u0000\u0000", null);
    }
}
