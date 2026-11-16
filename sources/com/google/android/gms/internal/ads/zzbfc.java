package com.google.android.gms.internal.ads;

import defpackage.dy4;
import defpackage.hz4;
import defpackage.jy4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbfc extends zzihc implements zziij {
    private static final zzbfc zzg;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        zzbfc zzbfcVar = new zzbfc();
        zzg = zzbfcVar;
        zzihc.z(zzbfc.class, zzbfcVar);
    }

    public static zzbfc J(jy4 jy4Var) {
        zzbfc zzbfcVar = zzg;
        zzigm zzigmVar = zzigm.b;
        int i = dy4.a;
        zzihc zzihcVarS = zzihc.s(zzbfcVar, jy4Var, zzigm.c);
        zzihc.D(zzihcVarS);
        return (zzbfc) zzihcVarS;
    }

    public static zzbfc K(jy4 jy4Var, zzigm zzigmVar) {
        return (zzbfc) zzihc.s(zzg, jy4Var, zzigmVar);
    }

    public static zzbfb L() {
        return (zzbfb) zzg.v();
    }

    public static zzbfc M() {
        return zzg;
    }

    public final String E() {
        return this.zzb;
    }

    public final String F() {
        return this.zzc;
    }

    public final long G() {
        return this.zzd;
    }

    public final long H() {
        return this.zze;
    }

    public final long I() {
        return this.zzf;
    }

    public final /* synthetic */ void P(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void Q(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void R(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    private zzbfc() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzbfb(zzg);
            }
            return new zzbfc();
        }
        return new hz4(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
    }

    public final /* synthetic */ void N(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void O(String str) {
        Objects.requireNonNull(str);
        this.zza |= 2;
        this.zzc = str;
    }
}
