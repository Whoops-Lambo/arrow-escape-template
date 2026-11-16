package com.google.android.gms.internal.ads;

import defpackage.hz4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhvx extends zzihc implements zziij {
    private static final zzhvx zzb;
    private String zza = "";

    static {
        zzhvx zzhvxVar = new zzhvx();
        zzb = zzhvxVar;
        zzihc.z(zzhvx.class, zzhvxVar);
    }

    public static zzhvx F(zzifx zzifxVar, zzigm zzigmVar) {
        return (zzhvx) zzihc.s(zzb, zzifxVar, zzigmVar);
    }

    public static zzhvw G() {
        return (zzhvw) zzb.v();
    }

    public static zzhvx H() {
        return zzb;
    }

    public final String E() {
        return this.zza;
    }

    private zzhvx() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhvw(zzb);
            }
            return new zzhvx();
        }
        return new hz4(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
    }

    public final /* synthetic */ void I(String str) {
        Objects.requireNonNull(str);
        this.zza = str;
    }
}
