package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.uw3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhfr extends zzihc implements zziij {
    private static final zzhfr zzd;
    private int zza;
    private long zzb;
    private int zzc;

    static {
        zzhfr zzhfrVar = new zzhfr();
        zzd = zzhfrVar;
        zzihc.z(zzhfr.class, zzhfrVar);
    }

    public static zzhfq E() {
        return (zzhfq) zzd.v();
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void G(int i) {
        this.zzc = i - 1;
        this.zza |= 2;
    }

    private zzhfr() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhfq(zzd);
            }
            return new zzhfr();
        }
        return new hz4(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", uw3.v});
    }
}
