package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.wz4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zziml extends zzihc implements zziij {
    private static final zziml zzj;
    private int zza;
    private long zzc;
    private boolean zzd;
    private int zze;
    private boolean zzh;
    private boolean zzi;
    private String zzb = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zziml zzimlVar = new zziml();
        zzj = zzimlVar;
        zzihc.z(zziml.class, zzimlVar);
    }

    public static zzimk E() {
        return (zzimk) zzj.v();
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void H(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }

    private zziml() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzimk(zzj);
            }
            return new zziml();
        }
        return new hz4(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", wz4.f, "zzf", "zzg", "zzh", "zzi"});
    }

    public final /* synthetic */ void F(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzb = str;
    }
}
