package com.google.android.gms.internal.ads;

import com.singular.sdk.internal.Constants;
import defpackage.hz4;
import defpackage.uw3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzazh extends zzihc implements zziij {
    private static final zzazh zzA;
    private int zza;
    private long zzu;
    private long zzv;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private int zzh = 1000;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private long zzp = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        zzazh zzazhVar = new zzazh();
        zzA = zzazhVar;
        zzihc.z(zzazh.class, zzazhVar);
    }

    public static zzazg E() {
        return (zzazg) zzA.v();
    }

    public final /* synthetic */ void F(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void J() {
        this.zza &= -9;
        this.zze = -1L;
    }

    public final /* synthetic */ void K(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void L(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    public final void M(zzazv zzazvVar) {
        this.zzh = zzazvVar.a;
        this.zza |= 64;
    }

    public final /* synthetic */ void N(long j) {
        this.zza |= 128;
        this.zzi = j;
    }

    public final /* synthetic */ void O(long j) {
        this.zza |= 256;
        this.zzj = j;
    }

    public final /* synthetic */ void P(long j) {
        this.zza |= 512;
        this.zzk = j;
    }

    public final void Q(zzazv zzazvVar) {
        this.zzl = zzazvVar.a;
        this.zza |= 1024;
    }

    public final /* synthetic */ void R(long j) {
        this.zza |= 2048;
        this.zzm = j;
    }

    public final /* synthetic */ void S(long j) {
        this.zza |= 4096;
        this.zzn = j;
    }

    public final /* synthetic */ void T(long j) {
        this.zza |= 8192;
        this.zzo = j;
    }

    public final /* synthetic */ void U(long j) {
        this.zza |= 16384;
        this.zzp = j;
    }

    public final /* synthetic */ void V(long j) {
        this.zza |= 32768;
        this.zzu = j;
    }

    public final /* synthetic */ void W(long j) {
        this.zza |= 65536;
        this.zzv = j;
    }

    public final /* synthetic */ void X(long j) {
        this.zza |= 131072;
        this.zzw = j;
    }

    public final /* synthetic */ void Y(long j) {
        this.zza |= Constants.REFERRER_LINK_MAX_RESPONSE_CHARS;
        this.zzx = j;
    }

    private zzazh() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzazg(zzA);
            }
            return new zzazh();
        }
        uw3 uw3Var = uw3.o;
        return new hz4(zzA, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", uw3Var, "zzi", "zzj", "zzk", "zzl", uw3Var, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
    }
}
