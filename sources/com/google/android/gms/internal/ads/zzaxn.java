package com.google.android.gms.internal.ads;

import android.os.Build;
import defpackage.gz4;
import defpackage.hz4;
import defpackage.uw3;
import defpackage.wy4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaxn extends zzihc implements zziij {
    private static final zzaxn zzu;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private int zzo;
    private int zzp;
    private zziho zzb = gz4.e;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private zzihk zzn = wy4.e;

    public final /* synthetic */ void U(int i) {
        this.zzp = 1;
        this.zza |= 4096;
    }

    static {
        zzaxn zzaxnVar = new zzaxn();
        zzu = zzaxnVar;
        zzihc.z(zzaxn.class, zzaxnVar);
    }

    public static zzaxm E() {
        return (zzaxm) zzu.v();
    }

    public final void F(zzayf zzayfVar) {
        zziho zzihoVar = this.zzb;
        if (!zzihoVar.zza()) {
            int size = zzihoVar.size();
            this.zzb = zzihoVar.zzh(size + size);
        }
        this.zzb.add(zzayfVar);
    }

    public final void G() {
        this.zzb = gz4.e;
    }

    public final /* synthetic */ void H(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    public final /* synthetic */ void I(String str) {
        String str2 = Build.MODEL;
        Objects.requireNonNull(str2);
        this.zza |= 2;
        this.zzd = str2;
    }

    public final /* synthetic */ void M(long j) {
        this.zza |= 64;
        this.zzi = j;
    }

    public final /* synthetic */ void P(long j) {
        this.zza |= 512;
        this.zzl = j;
    }

    public final /* synthetic */ void Q(long j) {
        this.zza |= 1024;
        this.zzm = j;
    }

    public final void R(zzihk zzihkVar) {
        zzihk zzihkVar2 = this.zzn;
        if (!zzihkVar2.zza()) {
            int size = zzihkVar2.size();
            this.zzn = zzihkVar2.zzh(size + size);
        }
        zzifg.l(zzihkVar, this.zzn);
    }

    public final /* synthetic */ void S(int i) {
        this.zzg = i - 1;
        this.zza |= 16;
    }

    public final void T(int i) {
        this.zzo = i - 2;
        this.zza |= 2048;
    }

    private zzaxn() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzaxm(zzu);
            }
            return new zzaxn();
        }
        return new hz4(zzu, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new Object[]{"zza", "zzb", zzayf.class, "zzc", "zzd", "zze", "zzf", "zzg", uw3.e, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
    }

    public final /* synthetic */ void J(String str) {
        Objects.requireNonNull(str);
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void K(String str) {
        Objects.requireNonNull(str);
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void L(String str) {
        Objects.requireNonNull(str);
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void N(String str) {
        Objects.requireNonNull(str);
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void O(String str) {
        Objects.requireNonNull(str);
        this.zza |= 256;
        this.zzk = str;
    }
}
