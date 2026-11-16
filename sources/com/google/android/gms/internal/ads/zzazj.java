package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzazj extends zzihc implements zziij {
    private static final zzazj zzj;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        zzazj zzazjVar = new zzazj();
        zzj = zzazjVar;
        zzihc.z(zzazj.class, zzazjVar);
    }

    public static zzazi E() {
        return (zzazi) zzj.v();
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void J(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    private zzazj() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzazi(zzj);
            }
            return new zzazj();
        }
        return new hz4(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
    }
}
