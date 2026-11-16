package com.google.android.gms.internal.ads;

import defpackage.hz4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzazx extends zzihc implements zziij {
    private static final zzazx zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";
    private String zzh = "";

    static {
        zzazx zzazxVar = new zzazx();
        zzi = zzazxVar;
        zzihc.z(zzazx.class, zzazxVar);
    }

    public static zzazw E() {
        return (zzazw) zzi.v();
    }

    public final /* synthetic */ void F(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void H(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void J(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void K(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    private zzazx() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzazw(zzi);
            }
            return new zzazx();
        }
        return new hz4(zzi, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
    }

    public final /* synthetic */ void G(String str) {
        Objects.requireNonNull(str);
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void I(String str) {
        Objects.requireNonNull(str);
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void L(String str) {
        Objects.requireNonNull(str);
        this.zza |= 64;
        this.zzh = str;
    }
}
