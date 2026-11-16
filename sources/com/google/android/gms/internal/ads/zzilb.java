package com.google.android.gms.internal.ads;

import defpackage.hz4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzilb extends zzihc implements zziij {
    private static final zzilb zzc;
    private int zza;
    private String zzb = "";

    static {
        zzilb zzilbVar = new zzilb();
        zzc = zzilbVar;
        zzihc.z(zzilb.class, zzilbVar);
    }

    public static zzila E() {
        return (zzila) zzc.v();
    }

    private zzilb() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzila(zzc);
            }
            return new zzilb();
        }
        return new hz4(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
    }

    public final /* synthetic */ void F(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzb = str;
    }
}
