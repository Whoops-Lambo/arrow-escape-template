package com.google.android.gms.internal.ads;

import defpackage.cz4;
import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzazo extends zzihc implements zziij {
    private static final zzazo zzc;
    private zzihn zza;
    private zzihn zzb;

    static {
        zzazo zzazoVar = new zzazo();
        zzc = zzazoVar;
        zzihc.z(zzazo.class, zzazoVar);
    }

    private zzazo() {
        cz4 cz4Var = cz4.e;
        this.zza = cz4Var;
        this.zzb = cz4Var;
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzazn(zzc);
            }
            return new zzazo();
        }
        return new hz4(zzc, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"zza", "zzb"});
    }
}
