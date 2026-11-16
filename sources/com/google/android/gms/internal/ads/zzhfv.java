package com.google.android.gms.internal.ads;

import defpackage.gz4;
import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhfv extends zzihc implements zziij {
    private static final zzhfv zzb;
    private zziho zza = gz4.e;

    static {
        zzhfv zzhfvVar = new zzhfv();
        zzb = zzhfvVar;
        zzihc.z(zzhfv.class, zzhfvVar);
    }

    public static zzhfs F() {
        return (zzhfs) zzb.v();
    }

    public final int E() {
        return this.zza.size();
    }

    public final void G(zzhfu zzhfuVar) {
        zziho zzihoVar = this.zza;
        if (!zzihoVar.zza()) {
            int size = zzihoVar.size();
            this.zza = zzihoVar.zzh(size + size);
        }
        this.zza.add(zzhfuVar);
    }

    private zzhfv() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhfs(zzb);
            }
            return new zzhfv();
        }
        return new hz4(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzhfu.class});
    }
}
