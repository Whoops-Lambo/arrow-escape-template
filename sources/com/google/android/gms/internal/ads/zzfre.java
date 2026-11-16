package com.google.android.gms.internal.ads;

import defpackage.gz4;
import defpackage.hz4;
import defpackage.wy4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfre extends zzihc implements zziij {
    private static final zzfre zzg;
    private long zza;
    private zzihk zzb = wy4.e;
    private zziho zzc;
    private zziho zzd;
    private zziho zze;
    private zziho zzf;

    static {
        zzfre zzfreVar = new zzfre();
        zzg = zzfreVar;
        zzihc.z(zzfre.class, zzfreVar);
    }

    private zzfre() {
        gz4 gz4Var = gz4.e;
        this.zzc = gz4Var;
        this.zzd = gz4Var;
        this.zze = gz4Var;
        this.zzf = gz4Var;
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzfrd(zzg);
            }
            return new zzfre();
        }
        return new hz4(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
    }
}
