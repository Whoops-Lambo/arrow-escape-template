package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhwq extends zzihc implements zziij {
    private static final zzhwq zzd;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhwq zzhwqVar = new zzhwq();
        zzd = zzhwqVar;
        zzihc.z(zzhwq.class, zzhwqVar);
    }

    public static zzhwp H() {
        return (zzhwp) zzd.v();
    }

    public static zzhwq I() {
        return zzd;
    }

    public final zzhuy E() {
        zzhuy zzhuyVarA = zzhuy.a(this.zza);
        return zzhuyVarA == null ? zzhuy.UNRECOGNIZED : zzhuyVarA;
    }

    public final zzhuy F() {
        zzhuy zzhuyVarA = zzhuy.a(this.zzb);
        return zzhuyVarA == null ? zzhuy.UNRECOGNIZED : zzhuyVarA;
    }

    public final int G() {
        return this.zzc;
    }

    public final /* synthetic */ void L(int i) {
        this.zzc = i;
    }

    private zzhwq() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhwp(zzd);
            }
            return new zzhwq();
        }
        return new hz4(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
    }

    public final /* synthetic */ void J(zzhuy zzhuyVar) {
        this.zza = zzhuyVar.zza();
    }

    public final /* synthetic */ void K(zzhuy zzhuyVar) {
        this.zzb = zzhuyVar.zza();
    }
}
