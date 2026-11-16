package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhtp extends zzihc implements zziij {
    private static final zzhtp zzd;
    private int zza;
    private zzhtr zzb;
    private int zzc;

    static {
        zzhtp zzhtpVar = new zzhtp();
        zzd = zzhtpVar;
        zzihc.z(zzhtp.class, zzhtpVar);
    }

    public static zzhto G() {
        return (zzhto) zzd.v();
    }

    public static zzhtp H() {
        return zzd;
    }

    public final zzhtr E() {
        zzhtr zzhtrVar = this.zzb;
        return zzhtrVar == null ? zzhtr.G() : zzhtrVar;
    }

    public final int F() {
        return this.zzc;
    }

    public final /* synthetic */ void I(zzhtr zzhtrVar) {
        this.zzb = zzhtrVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void J(int i) {
        this.zzc = i;
    }

    private zzhtp() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhto(zzd);
            }
            return new zzhtp();
        }
        return new hz4(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
    }
}
