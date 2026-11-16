package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzilf extends zzihc implements zziij {
    private static final zzilf zzf;
    private int zza;
    private zzile zzc;
    private long zzd;
    private String zzb = "";
    private String zze = "";

    static {
        zzilf zzilfVar = new zzilf();
        zzf = zzilfVar;
        zzihc.z(zzilf.class, zzilfVar);
    }

    private zzilf() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzilc(zzf);
            }
            return new zzilf();
        }
        return new hz4(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
    }
}
