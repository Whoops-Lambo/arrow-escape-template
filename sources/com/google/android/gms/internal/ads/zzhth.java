package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhth extends zzihc implements zziij {
    private static final zzhth zzb;
    private int zza;

    static {
        zzhth zzhthVar = new zzhth();
        zzb = zzhthVar;
        zzihc.z(zzhth.class, zzhthVar);
    }

    public static zzhtg F() {
        return (zzhtg) zzb.v();
    }

    public static zzhth G() {
        return zzb;
    }

    public final int E() {
        return this.zza;
    }

    public final /* synthetic */ void H(int i) {
        this.zza = i;
    }

    private zzhth() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhtg(zzb);
            }
            return new zzhth();
        }
        return new hz4(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
    }
}
