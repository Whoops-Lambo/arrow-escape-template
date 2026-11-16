package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.wy4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzikj extends zzihc implements zziij {
    private static final zzikj zzc;
    private zzihk zza;
    private zzihk zzb;

    static {
        zzikj zzikjVar = new zzikj();
        zzc = zzikjVar;
        zzihc.z(zzikj.class, zzikjVar);
    }

    public static zzikj E(byte[] bArr, zzigm zzigmVar) {
        return (zzikj) zzihc.t(zzc, bArr, zzigmVar);
    }

    private zzikj() {
        wy4 wy4Var = wy4.e;
        this.zza = wy4Var;
        this.zzb = wy4Var;
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zziki(zzc);
            }
            return new zzikj();
        }
        return new hz4(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
    }
}
