package com.google.android.gms.internal.ads;

import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzinp extends zzihc implements zziij {
    private static final zzinp zze;
    private int zza;
    private String zzb = "";
    private boolean zzc;
    private boolean zzd;

    static {
        zzinp zzinpVar = new zzinp();
        zze = zzinpVar;
        zzihc.z(zzinp.class, zzinpVar);
    }

    private zzinp() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzino(zze);
            }
            return new zzinp();
        }
        return new hz4(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
    }
}
