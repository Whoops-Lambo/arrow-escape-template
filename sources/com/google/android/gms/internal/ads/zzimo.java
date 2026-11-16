package com.google.android.gms.internal.ads;

import defpackage.gz4;
import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzimo extends zzihc implements zziij {
    private static final zzimo zzf;
    private int zza;
    private String zzb = "";
    private zziho zzc;
    private zziho zzd;
    private String zze;

    static {
        zzimo zzimoVar = new zzimo();
        zzf = zzimoVar;
        zzihc.z(zzimo.class, zzimoVar);
    }

    private zzimo() {
        gz4 gz4Var = gz4.e;
        this.zzc = gz4Var;
        this.zzd = gz4Var;
        this.zze = "";
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzimn(zzf);
            }
            return new zzimo();
        }
        return new hz4(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
    }
}
