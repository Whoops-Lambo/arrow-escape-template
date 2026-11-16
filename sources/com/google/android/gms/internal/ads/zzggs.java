package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzggs extends zzihc implements zziij {
    private static final zzggs zzf;
    private int zza;
    private float zzc;
    private String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = 60000;

    static {
        zzggs zzggsVar = new zzggs();
        zzf = zzggsVar;
        zzihc.z(zzggs.class, zzggsVar);
    }

    public static zzggr I() {
        return (zzggr) zzf.v();
    }

    public static zzggs J() {
        return zzf;
    }

    public final String E() {
        return this.zzb;
    }

    public final float F() {
        return this.zzc;
    }

    public final long G() {
        return this.zzd;
    }

    public final long H() {
        return this.zze;
    }

    public final /* synthetic */ void K(float f) {
        this.zza |= 2;
        this.zzc = f;
    }

    private zzggs() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzggr(zzf);
            }
            return new zzggs();
        }
        return new hz4(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
    }
}
