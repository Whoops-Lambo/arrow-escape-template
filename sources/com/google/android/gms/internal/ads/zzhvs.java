package com.google.android.gms.internal.ads;

import defpackage.hz4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhvs extends zzihc implements zziij {
    private static final zzhvs zze;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    public final void H(int i) {
        if (i != 1) {
            this.zzb = i - 2;
        } else {
            zzihp.a();
            throw null;
        }
    }

    public final /* synthetic */ void I(int i) {
        if (i != 1) {
            this.zzd = i - 2;
        } else {
            zzihp.a();
            throw null;
        }
    }

    static {
        zzhvs zzhvsVar = new zzhvs();
        zze = zzhvsVar;
        zzihc.z(zzhvs.class, zzhvsVar);
    }

    public static zzhvr E() {
        return (zzhvr) zze.v();
    }

    public final /* synthetic */ void G(int i) {
        this.zzc = i;
    }

    private zzhvs() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhvr(zze);
            }
            return new zzhvs();
        }
        return new hz4(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
    }

    public final /* synthetic */ void F(String str) {
        Objects.requireNonNull(str);
        this.zza = str;
    }
}
