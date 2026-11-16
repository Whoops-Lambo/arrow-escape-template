package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.wy4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbej extends zzihc implements zziij {
    private static final zzbej zze;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zzihk zzd = wy4.e;

    static {
        zzbej zzbejVar = new zzbej();
        zze = zzbejVar;
        zzihc.z(zzbej.class, zzbejVar);
    }

    public static zzbei E() {
        return (zzbei) zze.v();
    }

    public final /* synthetic */ void F(int i) {
        this.zzb = 15;
        this.zza |= 1;
    }

    private zzbej() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzbei(zze);
            }
            return new zzbej();
        }
        return new hz4(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003'", new Object[]{"zza", "zzb", "zzc", "zzd"});
    }
}
