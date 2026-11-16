package com.google.android.gms.internal.ads;

import defpackage.gz4;
import defpackage.hz4;
import defpackage.uw3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaxt extends zzihc implements zziij {
    private static final zzaxt zzo;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzi = "";
    private String zzk = "";
    private String zzl = "";
    private zziho zzm = gz4.e;

    static {
        zzaxt zzaxtVar = new zzaxt();
        zzo = zzaxtVar;
        zzihc.z(zzaxt.class, zzaxtVar);
    }

    public static zzaxp E() {
        return (zzaxp) zzo.v();
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void I(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void L(int i) {
        this.zzn = i - 1;
        this.zza |= 2048;
    }

    private zzaxt() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzaxp(zzo);
            }
            return new zzaxt();
        }
        return new hz4(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzaxr.class, "zzn", uw3.c});
    }

    public final /* synthetic */ void F(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void H(String str) {
        Objects.requireNonNull(str);
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void J(String str) {
        Objects.requireNonNull(str);
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void K(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1024;
        this.zzl = str;
    }
}
