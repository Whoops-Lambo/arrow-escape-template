package com.google.android.gms.internal.ads;

import defpackage.gz4;
import defpackage.hz4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhvt extends zzihc implements zziij {
    private static final zzhvt zzc;
    private int zza;
    private zziho zzb = gz4.e;

    static {
        zzhvt zzhvtVar = new zzhvt();
        zzc = zzhvtVar;
        zzihc.z(zzhvt.class, zzhvtVar);
    }

    public static zzhvq E() {
        return (zzhvq) zzc.v();
    }

    public final /* synthetic */ void F(int i) {
        this.zza = i;
    }

    public final void G(zzhvs zzhvsVar) {
        zziho zzihoVar = this.zzb;
        if (!zzihoVar.zza()) {
            int size = zzihoVar.size();
            this.zzb = zzihoVar.zzh(size + size);
        }
        this.zzb.add(zzhvsVar);
    }

    private zzhvt() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhvq(zzc);
            }
            return new zzhvt();
        }
        return new hz4(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhvs.class});
    }
}
