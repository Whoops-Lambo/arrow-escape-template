package com.google.android.gms.internal.ads;

import defpackage.gz4;
import defpackage.hz4;
import defpackage.wz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzini extends zzihc implements zziij {
    private static final zzini zzp;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private zziho zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private double zzi;
    private zziho zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    static {
        zzini zziniVar = new zzini();
        zzp = zziniVar;
        zzihc.z(zzini.class, zziniVar);
    }

    private zzini() {
        gz4 gz4Var = gz4.e;
        this.zze = gz4Var;
        this.zzf = "";
        this.zzg = "";
        this.zzj = gz4Var;
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzind(zzp);
            }
            return new zzini();
        }
        return new hz4(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", wz4.k, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzing.class, "zzc", "zzk", wz4.j, "zzl", "zzm", "zzn", "zzo"});
    }
}
