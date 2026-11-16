package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.uw3;
import defpackage.wy4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzgar extends zzihc implements zziij {
    private static final zzgar zzf;
    private int zza;
    private zzihk zzb = wy4.e;
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        zzgar zzgarVar = new zzgar();
        zzf = zzgarVar;
        zzihc.z(zzgar.class, zzgarVar);
    }

    public static zzgaq E() {
        return (zzgaq) zzf.v();
    }

    public final void F() {
        zzihk zzihkVar = this.zzb;
        if (!zzihkVar.zza()) {
            int size = zzihkVar.size();
            this.zzb = zzihkVar.zzh(size + size);
        }
        this.zzb.zzi(2);
    }

    private zzgar() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzgaq(zzf);
            }
            return new zzgar();
        }
        return new hz4(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", uw3.r, "zzc", "zzd", "zze"});
    }

    public final /* synthetic */ void G(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzc = str;
    }
}
