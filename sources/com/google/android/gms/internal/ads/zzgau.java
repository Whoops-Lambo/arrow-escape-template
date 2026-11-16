package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.uw3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzgau extends zzihc implements zziij {
    private static final zzgau zzf;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private zzgar zze;

    public final /* synthetic */ void H(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }

    static {
        zzgau zzgauVar = new zzgau();
        zzf = zzgauVar;
        zzihc.z(zzgau.class, zzgauVar);
    }

    public static zzgas E() {
        return (zzgas) zzf.v();
    }

    public final /* synthetic */ void G(zzgar zzgarVar) {
        this.zze = zzgarVar;
        this.zza |= 8;
    }

    private zzgau() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzgas(zzf);
            }
            return new zzgau();
        }
        return new hz4(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", uw3.s, "zzc", "zzd", "zze"});
    }

    public final /* synthetic */ void F(String str) {
        Objects.requireNonNull(str);
        this.zza |= 2;
        this.zzc = str;
    }
}
