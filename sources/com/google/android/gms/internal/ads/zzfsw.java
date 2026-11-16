package com.google.android.gms.internal.ads;

import defpackage.gz4;
import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfsw extends zzihc implements zziij {
    private static final zzfsw zzc;
    private zziho zza = gz4.e;
    private long zzb;

    static {
        zzfsw zzfswVar = new zzfsw();
        zzc = zzfswVar;
        zzihc.z(zzfsw.class, zzfswVar);
    }

    public static zzfsv E() {
        return (zzfsv) zzc.v();
    }

    public final void F(zzfrg zzfrgVar) {
        zziho zzihoVar = this.zza;
        if (!zzihoVar.zza()) {
            int size = zzihoVar.size();
            this.zza = zzihoVar.zzh(size + size);
        }
        this.zza.add(zzfrgVar);
    }

    public final /* synthetic */ void G(long j) {
        this.zzb = j;
    }

    private zzfsw() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzfsv(zzc);
            }
            return new zzfsw();
        }
        return new hz4(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", zzfrg.class, "zzb"});
    }
}
