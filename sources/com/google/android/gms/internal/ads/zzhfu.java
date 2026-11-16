package com.google.android.gms.internal.ads;

import defpackage.cz4;
import defpackage.gz4;
import defpackage.hz4;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhfu extends zzihc implements zziij {
    private static final zzhfu zzf;
    private int zza;
    private zzhfr zzb;
    private zziji zzc;
    private zziho zzd = gz4.e;
    private zzihn zze = cz4.e;

    static {
        zzhfu zzhfuVar = new zzhfu();
        zzf = zzhfuVar;
        zzihc.z(zzhfu.class, zzhfuVar);
    }

    public static zzhft E() {
        return (zzhft) zzf.v();
    }

    public final /* synthetic */ void F(zzhfr zzhfrVar) {
        this.zzb = zzhfrVar;
        this.zza |= 1;
    }

    public final void G(ArrayDeque arrayDeque) {
        zzihn zzihnVar = this.zze;
        if (!zzihnVar.zza()) {
            int size = zzihnVar.size();
            this.zze = zzihnVar.zzh(size + size);
        }
        zzifg.l(arrayDeque, this.zze);
    }

    private zzhfu() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhft(zzf);
            }
            return new zzhfu();
        }
        return new hz4(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004%", new Object[]{"zza", "zzb", "zzc", "zzd", zziji.class, "zze"});
    }
}
