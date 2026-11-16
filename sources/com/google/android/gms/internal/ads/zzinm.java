package com.google.android.gms.internal.ads;

import defpackage.gz4;
import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzinm extends zzihc implements zziij {
    private static final zzinm zzb;
    private zziho zza = gz4.e;

    static {
        zzinm zzinmVar = new zzinm();
        zzb = zzinmVar;
        zzihc.z(zzinm.class, zzinmVar);
    }

    private zzinm() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzinl(zzb);
            }
            return new zzinm();
        }
        return new hz4(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzink.class});
    }
}
