package com.google.android.gms.internal.ads;

import defpackage.gz4;
import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public final class zzhwe extends zzihc implements zziij {
    public static final /* synthetic */ int zza = 0;
    private static final zzhwe zzd;
    private String zzb = "";
    private zziho zzc = gz4.e;

    static {
        zzhwe zzhweVar = new zzhwe();
        zzd = zzhweVar;
        zzihc.z(zzhwe.class, zzhweVar);
    }

    private zzhwe() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhwd(zzd);
            }
            return new zzhwe();
        }
        return new hz4(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", zzhvl.class});
    }
}
