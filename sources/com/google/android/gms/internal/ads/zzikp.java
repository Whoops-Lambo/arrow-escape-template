package com.google.android.gms.internal.ads;

import defpackage.gz4;
import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzikp extends zzihc implements zziij {
    private static final zzikp zzb;
    private zziho zza = gz4.e;

    static {
        zzikp zzikpVar = new zzikp();
        zzb = zzikpVar;
        zzihc.z(zzikp.class, zzikpVar);
    }

    public static zziko E() {
        return (zziko) zzb.v();
    }

    private zzikp() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zziko(zzb);
            }
            return new zzikp();
        }
        return new hz4(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzikn.class});
    }
}
