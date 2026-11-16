package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.uw3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzayf extends zzihc implements zziij {
    private static final zzayf zzi;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzayf zzayfVar = new zzayf();
        zzi = zzayfVar;
        zzihc.z(zzayf.class, zzayfVar);
    }

    public static zzaye E() {
        return (zzaye) zzi.v();
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void H(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void J(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    public final /* synthetic */ void L(int i) {
        this.zzd = i - 1;
        this.zza |= 4;
    }

    private zzayf() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzaye(zzi);
            }
            return new zzayf();
        }
        return new hz4(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", uw3.f, "zze", "zzf", "zzg", "zzh"});
    }

    public final /* synthetic */ void I(String str) {
        Objects.requireNonNull(str);
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void K(String str) {
        Objects.requireNonNull(str);
        this.zza |= 64;
        this.zzh = str;
    }
}
