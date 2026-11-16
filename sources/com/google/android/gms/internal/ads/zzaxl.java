package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.uw3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaxl extends zzihc implements zziij {
    private static final zzaxl zzj;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzayc zzg;
    private zzayi zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        zzaxl zzaxlVar = new zzaxl();
        zzj = zzaxlVar;
        zzihc.z(zzaxl.class, zzaxlVar);
    }

    public static zzaxk I() {
        return (zzaxk) zzj.v();
    }

    public final String E() {
        return this.zzd;
    }

    public final boolean F() {
        return this.zze;
    }

    public final zzayc G() {
        zzayc zzaycVar = this.zzg;
        return zzaycVar == null ? zzayc.H() : zzaycVar;
    }

    public final void H() {
        if (this.zzh == null) {
            int i = zzayi.a;
        }
    }

    public final /* synthetic */ void K(boolean z) {
        this.zza |= 8;
        this.zze = z;
    }

    private zzaxl() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzaxk(zzj);
            }
            return new zzaxl();
        }
        return new hz4(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", uw3.b, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
    }

    public final /* synthetic */ void J(String str) {
        Objects.requireNonNull(str);
        this.zza |= 4;
        this.zzd = str;
    }
}
