package com.google.android.gms.internal.ads;

import defpackage.gz4;
import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzftk extends zzihc implements zziij {
    private static final zzftk zzf;
    private long zza;
    private long zzb;
    private zziho zzc;
    private zziho zzd;
    private zziho zze;

    static {
        zzftk zzftkVar = new zzftk();
        zzf = zzftkVar;
        zzihc.z(zzftk.class, zzftkVar);
    }

    private zzftk() {
        gz4 gz4Var = gz4.e;
        this.zzc = gz4Var;
        this.zzd = gz4Var;
        this.zze = gz4Var;
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzftj(zzf);
            }
            return new zzftk();
        }
        return new hz4(zzf, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\u0002\u0003Ț\u0004Ț\u0005Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
    }
}
