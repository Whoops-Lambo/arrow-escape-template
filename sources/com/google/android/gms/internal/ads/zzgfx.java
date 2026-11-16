package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.uw3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgfx extends zzihc implements zziij {
    private static final zzgfx zzH;
    private boolean zzC;
    private boolean zzF;
    private boolean zzG;
    private int zza;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzh;
    private zzggs zzj;
    private boolean zzk;
    private zzggu zzn;
    private int zzc = 1;
    private boolean zzd = true;
    private String zzg = "unknown_host";
    private boolean zzi = true;
    private long zzl = 100;
    private long zzm = 2000;
    private long zzo = 10;
    private long zzp = 100;
    private long zzu = 20000;
    private String zzv = "";
    private String zzw = "";
    private long zzx = 500;
    private long zzy = 3000;
    private boolean zzz = true;
    private boolean zzA = true;
    private boolean zzB = true;
    private boolean zzD = true;
    private boolean zzE = true;

    public final /* synthetic */ void V(int i) {
        this.zzh = 1;
        this.zza |= 64;
    }

    static {
        zzgfx zzgfxVar = new zzgfx();
        zzH = zzgfxVar;
        zzihc.z(zzgfx.class, zzgfxVar);
    }

    public static zzgfv v0() {
        return (zzgfv) zzH.v();
    }

    public final /* synthetic */ void E(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }

    public final /* synthetic */ void F(boolean z) {
        this.zza |= 8;
        this.zze = z;
    }

    public final /* synthetic */ void G(boolean z) {
        this.zza |= 16;
        this.zzf = z;
    }

    public final /* synthetic */ void I(zzggs zzggsVar) {
        this.zzj = zzggsVar;
        this.zza |= 256;
    }

    public final /* synthetic */ void J(long j) {
        this.zza |= 1024;
        this.zzl = j;
    }

    public final /* synthetic */ void K(long j) {
        this.zza |= 2048;
        this.zzm = j;
    }

    public final /* synthetic */ void L(zzggu zzgguVar) {
        this.zzn = zzgguVar;
        this.zza |= 4096;
    }

    public final /* synthetic */ void M(long j) {
        this.zza |= 524288;
        this.zzy = j;
    }

    public final /* synthetic */ void N(boolean z) {
        this.zza |= 1048576;
        this.zzz = z;
    }

    public final /* synthetic */ void O(boolean z) {
        this.zza |= 16777216;
        this.zzD = z;
    }

    public final /* synthetic */ void P(boolean z) {
        this.zza |= 33554432;
        this.zzE = z;
    }

    public final int Q() {
        int iA = zzgfz.a(this.zzb);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int R() {
        int iA = zzgfz.a(this.zzc);
        if (iA == 0) {
            return 2;
        }
        return iA;
    }

    public final int S() {
        int i;
        switch (this.zzh) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void T(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    public final /* synthetic */ void U(int i) {
        this.zzc = i - 1;
        this.zza |= 2;
    }

    public final boolean W() {
        return this.zzd;
    }

    public final boolean X() {
        return this.zze;
    }

    public final boolean Y() {
        return this.zzf;
    }

    public final String Z() {
        return this.zzg;
    }

    public final boolean a0() {
        return this.zzi;
    }

    public final zzggs b0() {
        zzggs zzggsVar = this.zzj;
        return zzggsVar == null ? zzggs.J() : zzggsVar;
    }

    public final boolean c0() {
        return this.zzk;
    }

    public final long d0() {
        return this.zzl;
    }

    public final long e0() {
        return this.zzm;
    }

    public final zzggu f0() {
        zzggu zzgguVar = this.zzn;
        return zzgguVar == null ? zzggu.M() : zzgguVar;
    }

    public final long g0() {
        return this.zzo;
    }

    public final long h0() {
        return this.zzp;
    }

    public final long i0() {
        return this.zzu;
    }

    public final String j0() {
        return this.zzv;
    }

    public final String l0() {
        return this.zzw;
    }

    public final long m0() {
        return this.zzx;
    }

    public final long n0() {
        return this.zzy;
    }

    public final boolean o0() {
        return this.zzz;
    }

    public final boolean p0() {
        return this.zzA;
    }

    public final boolean q0() {
        return this.zzC;
    }

    public final boolean r0() {
        return this.zzD;
    }

    public final boolean s0() {
        return this.zzE;
    }

    public final boolean t0() {
        return this.zzF;
    }

    public final boolean u0() {
        return this.zzG;
    }

    private zzgfx() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzgfv(zzH);
            }
            return new zzgfx();
        }
        uw3 uw3Var = uw3.t;
        return new hz4(zzH, "\u0004\u001c\u0000\u0001\u0001\u001d\u001c\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006\u001aဇ\u0018\u001bဇ\u0019\u001cဇ\u001a\u001dဇ\u001b", new Object[]{"zza", "zzb", uw3Var, "zzg", "zzi", "zzj", "zzk", "zzm", "zzn", "zzd", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzl", "zzA", "zzB", "zzC", "zzc", uw3Var, "zze", "zzf", "zzh", "zzD", "zzE", "zzF", "zzG"});
    }

    public final /* synthetic */ void H(String str) {
        Objects.requireNonNull(str);
        this.zza |= 32;
        this.zzg = str;
    }
}
