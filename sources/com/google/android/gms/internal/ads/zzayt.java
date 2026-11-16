package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.uw3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzayt extends zzihc implements zziij {
    private static final zzayt zze;
    private int zza;
    private long zzb = -1;
    private int zzc = 1000;
    private int zzd = 1000;

    static {
        zzayt zzaytVar = new zzayt();
        zze = zzaytVar;
        zzihc.z(zzayt.class, zzaytVar);
    }

    public static zzays E() {
        return (zzays) zze.v();
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final void G(zzazv zzazvVar) {
        this.zzc = zzazvVar.a;
        this.zza |= 2;
    }

    public final void H(zzazv zzazvVar) {
        this.zzd = zzazvVar.a;
        this.zza |= 4;
    }

    private zzayt() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzays(zze);
            }
            return new zzayt();
        }
        uw3 uw3Var = uw3.o;
        return new hz4(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", "zzc", uw3Var, "zzd", uw3Var});
    }
}
