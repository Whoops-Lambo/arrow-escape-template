package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzayc extends zzihc implements zziij {
    private static final zzayc zzg;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzayc zzaycVar = new zzayc();
        zzg = zzaycVar;
        zzihc.z(zzayc.class, zzaycVar);
    }

    public static zzayc H() {
        return zzg;
    }

    public final boolean E() {
        return this.zzb;
    }

    public final int F() {
        return this.zzc;
    }

    public final boolean G() {
        return this.zze;
    }

    private zzayc() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzayb(zzg);
            }
            return new zzayc();
        }
        return new hz4(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
    }
}
