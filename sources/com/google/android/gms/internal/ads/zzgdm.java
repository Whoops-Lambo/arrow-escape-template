package com.google.android.gms.internal.ads;

import defpackage.cz4;
import defpackage.hz4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzgdm extends zzihc implements zziij {
    private static final zzgdm zzn;
    private int zza;
    private String zzb = "";
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private zzihn zzk;
    private zzihn zzl;
    private zzihn zzm;

    static {
        zzgdm zzgdmVar = new zzgdm();
        zzn = zzgdmVar;
        zzihc.z(zzgdm.class, zzgdmVar);
    }

    public static zzgdm V() {
        return zzn;
    }

    public final void E(long j) {
        zzihn zzihnVar = this.zzl;
        if (!zzihnVar.zza()) {
            int size = zzihnVar.size();
            this.zzl = zzihnVar.zzh(size + size);
        }
        this.zzl.j(j);
    }

    public final void F(long j) {
        zzihn zzihnVar = this.zzm;
        if (!zzihnVar.zza()) {
            int size = zzihnVar.size();
            this.zzm = zzihnVar.zzh(size + size);
        }
        this.zzm.j(j);
    }

    public final void G() {
        this.zzm = cz4.e;
    }

    public final String H() {
        return this.zzb;
    }

    public final long I() {
        return this.zzc;
    }

    public final int J() {
        return this.zzd;
    }

    public final boolean K() {
        return this.zze;
    }

    public final boolean L() {
        return this.zzf;
    }

    public final long M() {
        return this.zzg;
    }

    public final long N() {
        return this.zzh;
    }

    public final long O() {
        return this.zzi;
    }

    public final boolean P() {
        return (this.zza & 64) != 0;
    }

    public final zzihn Q() {
        return this.zzk;
    }

    public final int R() {
        return this.zzk.size();
    }

    public final int S() {
        return this.zzl.size();
    }

    public final zzihn T() {
        return this.zzm;
    }

    public final int U() {
        return this.zzm.size();
    }

    public final /* synthetic */ void X(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    public final /* synthetic */ void Y(int i) {
        this.zza |= 2;
        this.zzd = i;
    }

    public final /* synthetic */ void Z() {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void a0(boolean z) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void b0(long j) {
        this.zza |= 16;
        this.zzg = j;
    }

    public final /* synthetic */ void c0(long j) {
        this.zzh = j;
    }

    public final /* synthetic */ void d0(long j) {
        this.zza |= 32;
        this.zzi = j;
    }

    public final /* synthetic */ void e0(long j) {
        this.zza |= 64;
        this.zzj = j;
    }

    public final void f0(long j) {
        zzihn zzihnVar = this.zzk;
        if (!zzihnVar.zza()) {
            int size = zzihnVar.size();
            this.zzk = zzihnVar.zzh(size + size);
        }
        this.zzk.j(j);
    }

    private zzgdm() {
        cz4 cz4Var = cz4.e;
        this.zzk = cz4Var;
        this.zzl = cz4Var;
        this.zzm = cz4Var;
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzgdl(zzn);
            }
            return new zzgdm();
        }
        return new hz4(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
    }

    public final /* synthetic */ void W(String str) {
        Objects.requireNonNull(str);
        this.zzb = str;
    }
}
