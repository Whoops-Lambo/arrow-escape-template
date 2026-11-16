package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhve extends zzihc implements zziij {
    private static final zzhve zzc;
    private int zza;
    private int zzb;

    static {
        zzhve zzhveVar = new zzhve();
        zzc = zzhveVar;
        zzihc.z(zzhve.class, zzhveVar);
    }

    public static zzhvd G() {
        return (zzhvd) zzc.v();
    }

    public static zzhve H() {
        return zzc;
    }

    public final zzhuy E() {
        zzhuy zzhuyVarA = zzhuy.a(this.zza);
        return zzhuyVarA == null ? zzhuy.UNRECOGNIZED : zzhuyVarA;
    }

    public final int F() {
        return this.zzb;
    }

    public final /* synthetic */ void J(int i) {
        this.zzb = i;
    }

    private zzhve() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhvd(zzc);
            }
            return new zzhve();
        }
        return new hz4(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
    }

    public final /* synthetic */ void I(zzhuy zzhuyVar) {
        this.zza = zzhuyVar.zza();
    }
}
