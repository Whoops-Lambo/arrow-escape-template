package com.google.android.gms.internal.ads;

import defpackage.hz4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfsj extends zzihc implements zziij {
    private static final zzfsj zzi;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        zzfsj zzfsjVar = new zzfsj();
        zzi = zzfsjVar;
        zzihc.z(zzfsj.class, zzfsjVar);
    }

    public static zzfsi E() {
        return (zzfsi) zzi.v();
    }

    public final /* synthetic */ void G(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zzc = j;
    }

    public final /* synthetic */ void I(boolean z) {
        this.zzd = z;
    }

    public final /* synthetic */ void J(long j) {
        this.zze = j;
    }

    public final /* synthetic */ void K(long j) {
        this.zzf = j;
    }

    public final /* synthetic */ void M(int i) {
        this.zzh = i - 2;
    }

    private zzfsj() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzfsi(zzi);
            }
            return new zzfsj();
        }
        return new hz4(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
    }

    public final /* synthetic */ void F(String str) {
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final /* synthetic */ void L(String str) {
        Objects.requireNonNull(str);
        this.zzg = str;
    }
}
