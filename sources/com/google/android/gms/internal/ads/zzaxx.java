package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.uw3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaxx extends zzihc implements zziij {
    private static final zzaxx zzc;
    private int zza;
    private int zzb = 2;

    static {
        zzaxx zzaxxVar = new zzaxx();
        zzc = zzaxxVar;
        zzihc.z(zzaxx.class, zzaxxVar);
    }

    private zzaxx() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzaxw(zzc);
            }
            return new zzaxx();
        }
        return new hz4(zzc, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zza", "zzb", uw3.d});
    }
}
