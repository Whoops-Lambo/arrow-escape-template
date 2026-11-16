package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzggu extends zzihc implements zziij {
    private static final zzggu zzl;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = 600000;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = 60000;

    static {
        zzggu zzgguVar = new zzggu();
        zzl = zzgguVar;
        zzihc.z(zzggu.class, zzgguVar);
    }

    public static zzggt L() {
        return (zzggt) zzl.v();
    }

    public static zzggu M() {
        return zzl;
    }

    public final boolean E() {
        return this.zzd;
    }

    public final long F() {
        return this.zzf;
    }

    public final String G() {
        return this.zzg;
    }

    public final long H() {
        return this.zzh;
    }

    public final boolean I() {
        return this.zzi;
    }

    public final long J() {
        return this.zzj;
    }

    public final long K() {
        return this.zzk;
    }

    public final /* synthetic */ void N(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }

    public final /* synthetic */ void O(long j) {
        this.zza |= 64;
        this.zzh = j;
    }

    private zzggu() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzggt(zzl);
            }
            return new zzggu();
        }
        return new hz4(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
    }
}
