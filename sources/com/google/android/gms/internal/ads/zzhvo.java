package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhvo extends zzihc implements zziij {
    private static final zzhvo zzf;
    private int zza;
    private zzhvg zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public final void L(int i) {
        if (i != 1) {
            this.zzc = i - 2;
        } else {
            zzihp.a();
            throw null;
        }
    }

    static {
        zzhvo zzhvoVar = new zzhvo();
        zzf = zzhvoVar;
        zzihc.z(zzhvo.class, zzhvoVar);
    }

    public static zzhvn G() {
        return (zzhvn) zzf.v();
    }

    public final zzhvg E() {
        zzhvg zzhvgVar = this.zzb;
        return zzhvgVar == null ? zzhvg.H() : zzhvgVar;
    }

    public final int F() {
        return this.zzd;
    }

    public final /* synthetic */ void H(zzhvg zzhvgVar) {
        this.zzb = zzhvgVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(int i) {
        this.zzd = i;
    }

    public final int J() {
        int i = this.zzc;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = i != 3 ? 0 : 5;
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int K() {
        int iA = zzhwc.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final /* synthetic */ void M(int i) {
        this.zze = i - 2;
    }

    private zzhvo() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhvn(zzf);
            }
            return new zzhvo();
        }
        return new hz4(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
    }
}
