package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhwi extends zzihc implements zziij {
    private static final zzhwi zzb;
    private int zza;

    static {
        zzhwi zzhwiVar = new zzhwi();
        zzb = zzhwiVar;
        zzihc.z(zzhwi.class, zzhwiVar);
    }

    public static zzhwh F() {
        return (zzhwh) zzb.v();
    }

    public static zzhwi G() {
        return zzb;
    }

    public final zzhuy E() {
        zzhuy zzhuyVarA = zzhuy.a(this.zza);
        return zzhuyVarA == null ? zzhuy.UNRECOGNIZED : zzhuyVarA;
    }

    private zzhwi() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhwh(zzb);
            }
            return new zzhwi();
        }
        return new hz4(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
    }

    public final /* synthetic */ void H(zzhuy zzhuyVar) {
        this.zza = zzhuyVar.zza();
    }
}
