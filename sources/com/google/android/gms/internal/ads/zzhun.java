package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhun extends zzihc implements zziij {
    private static final zzhun zzd;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhun zzhunVar = new zzhun();
        zzd = zzhunVar;
        zzihc.z(zzhun.class, zzhunVar);
    }

    public static zzhum F() {
        return (zzhum) zzd.v();
    }

    public static zzhun G() {
        return zzd;
    }

    public final zzhuy E() {
        zzhuy zzhuyVarA = zzhuy.a(this.zza);
        return zzhuyVarA == null ? zzhuy.UNRECOGNIZED : zzhuyVarA;
    }

    public final int I() {
        int i = this.zzb;
        int i2 = 2;
        if (i != 0) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3) {
                i2 = 5;
            } else if (i != 4) {
                i2 = i != 5 ? 0 : 7;
            } else {
                i2 = 6;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int J() {
        int i = this.zzc;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 4;
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final /* synthetic */ void K(int i) {
        this.zzb = i - 2;
    }

    public final /* synthetic */ void L(int i) {
        this.zzc = i - 2;
    }

    private zzhun() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhum(zzd);
            }
            return new zzhun();
        }
        return new hz4(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
    }

    public final /* synthetic */ void H(zzhuy zzhuyVar) {
        this.zza = zzhuyVar.zza();
    }
}
