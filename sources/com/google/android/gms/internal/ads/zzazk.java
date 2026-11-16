package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import com.singular.sdk.internal.Constants;
import defpackage.gz4;
import defpackage.hz4;
import defpackage.uw3;
import defpackage.wy4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzazk extends zzihc implements zziij {
    private static final zzazk zzbs;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzH;
    private long zzI;
    private long zzJ;
    private long zzL;
    private zzazm zzO;
    private int zza;
    private int zzaA;
    private String zzaB;
    private zziho zzaC;
    private int zzaD;
    private zziho zzaE;
    private zzazf zzaF;
    private zzazd zzaG;
    private String zzaH;
    private long zzaI;
    private long zzaJ;
    private long zzaK;
    private long zzaL;
    private long zzaM;
    private long zzaN;
    private long zzaO;
    private String zzaP;
    private long zzaQ;
    private zzayt zzaR;
    private zzayv zzaS;
    private long zzaT;
    private long zzaU;
    private int zzaV;
    private String zzaW;
    private String zzaX;
    private long zzaY;
    private long zzaZ;
    private zzazh zzag;
    private zziho zzah;
    private zzazj zzai;
    private long zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    private long zzap;
    private long zzaq;
    private String zzar;
    private long zzas;
    private int zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private zzbac zzax;
    private long zzay;
    private int zzaz;
    private int zzb;
    private int zzba;
    private zzayr zzbb;
    private boolean zzbc;
    private long zzbd;
    private String zzbe;
    private int zzbf;
    private boolean zzbg;
    private String zzbh;
    private long zzbi;
    private zzbaa zzbj;
    private long zzbk;
    private String zzbl;
    private zzihk zzbm;
    private long zzbn;
    private int zzbo;
    private int zzbp;
    private int zzbq;
    private String zzbr;
    private int zzc;
    private int zzd;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zze = "";
    private String zzf = "";
    private String zzu = "";
    private String zzE = "";
    private String zzF = "D";
    private String zzG = "";
    private String zzK = "";
    private long zzM = -1;
    private long zzN = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private String zzV = "D";
    private String zzW = "D";
    private long zzX = -1;
    private int zzY = 1000;
    private int zzZ = 1000;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private int zzaf = 1000;

    static {
        zzazk zzazkVar = new zzazk();
        zzbs = zzazkVar;
        zzihc.z(zzazk.class, zzazkVar);
    }

    public static zzazk M0(byte[] bArr, zzigm zzigmVar) {
        return (zzazk) zzihc.t(zzbs, bArr, zzigmVar);
    }

    public static zzayj N0() {
        return (zzayj) zzbs.v();
    }

    public static zzazk O0() {
        return zzbs;
    }

    public final void A0(zzayy zzayyVar) {
        this.zzaV = zzayyVar.a;
        this.zzc |= 16777216;
    }

    public final /* synthetic */ void B0(long j) {
        this.zzd |= 32;
        this.zzbi = j;
    }

    public final void D0(zzazv zzazvVar) {
        this.zzbo = zzazvVar.a;
        this.zzd |= 1024;
    }

    public final /* synthetic */ void E(long j) {
        this.zza |= 2097152;
        this.zzD = j;
    }

    public final long E0() {
        return this.zzB;
    }

    public final boolean F0() {
        return (this.zza & 4194304) != 0;
    }

    public final String G0() {
        return this.zzE;
    }

    public final /* synthetic */ void H(long j) {
        this.zza |= 33554432;
        this.zzH = j;
    }

    public final boolean H0() {
        return (this.zzb & 1048576) != 0;
    }

    public final /* synthetic */ void I(long j) {
        this.zza |= C.BUFFER_FLAG_NOT_DEPENDED_ON;
        this.zzI = j;
    }

    public final long I0() {
        return this.zzaj;
    }

    public final /* synthetic */ void J(long j) {
        this.zza |= 134217728;
        this.zzJ = j;
    }

    public final long J0() {
        return this.zzan;
    }

    public final boolean K0() {
        return (this.zzd & 64) != 0;
    }

    public final /* synthetic */ void L(long j) {
        this.zza |= 536870912;
        this.zzL = j;
    }

    public final zzbaa L0() {
        zzbaa zzbaaVar = this.zzbj;
        return zzbaaVar == null ? zzbaa.K() : zzbaaVar;
    }

    public final /* synthetic */ void M(long j) {
        this.zza |= 1073741824;
        this.zzM = j;
    }

    public final /* synthetic */ void N(long j) {
        this.zza |= Integer.MIN_VALUE;
        this.zzN = j;
    }

    public final /* synthetic */ void O(long j) {
        this.zzb |= 2;
        this.zzP = j;
    }

    public final /* synthetic */ void P(long j) {
        this.zzb |= 4;
        this.zzQ = j;
    }

    public final /* synthetic */ void Q(long j) {
        this.zzb |= 8;
        this.zzR = j;
    }

    public final /* synthetic */ void R(long j) {
        this.zzb |= 16;
        this.zzS = j;
    }

    public final /* synthetic */ void R0(long j) {
        this.zza |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void S(long j) {
        this.zzb |= 32;
        this.zzT = j;
    }

    public final /* synthetic */ void S0(long j) {
        this.zza |= 16;
        this.zzi = j;
    }

    public final /* synthetic */ void T(long j) {
        this.zzb |= 64;
        this.zzU = j;
    }

    public final /* synthetic */ void T0(long j) {
        this.zza |= 32;
        this.zzj = j;
    }

    public final /* synthetic */ void U0(long j) {
        this.zza |= 1024;
        this.zzo = j;
    }

    public final /* synthetic */ void V0(long j) {
        this.zza |= 2048;
        this.zzp = j;
    }

    public final void W(zzazv zzazvVar) {
        this.zzY = zzazvVar.a;
        this.zzb |= 1024;
    }

    public final /* synthetic */ void W0(long j) {
        this.zza |= 8192;
        this.zzv = j;
    }

    public final void X(zzazv zzazvVar) {
        this.zzZ = zzazvVar.a;
        this.zzb |= 2048;
    }

    public final /* synthetic */ void X0(long j) {
        this.zza |= 16384;
        this.zzw = j;
    }

    public final /* synthetic */ void Y(long j) {
        this.zzb |= 4096;
        this.zzaa = j;
    }

    public final /* synthetic */ void Y0(long j) {
        this.zza |= 32768;
        this.zzx = j;
    }

    public final /* synthetic */ void Z(long j) {
        this.zzb |= 8192;
        this.zzab = j;
    }

    public final /* synthetic */ void Z0(long j) {
        this.zza |= 65536;
        this.zzy = j;
    }

    public final /* synthetic */ void a0(long j) {
        this.zzb |= 16384;
        this.zzac = j;
    }

    public final /* synthetic */ void a1(long j) {
        this.zza |= 524288;
        this.zzB = j;
    }

    public final void b0(zzazv zzazvVar) {
        this.zzaf = zzazvVar.a;
        this.zzb |= 131072;
    }

    public final /* synthetic */ void b1(long j) {
        this.zza |= 1048576;
        this.zzC = j;
    }

    public final /* synthetic */ void c0(zzazh zzazhVar) {
        this.zzag = zzazhVar;
        this.zzb |= Constants.REFERRER_LINK_MAX_RESPONSE_CHARS;
    }

    public final void d0(zzazh zzazhVar) {
        zziho zzihoVar = this.zzah;
        if (!zzihoVar.zza()) {
            int size = zzihoVar.size();
            this.zzah = zzihoVar.zzh(size + size);
        }
        this.zzah.add(zzazhVar);
    }

    public final boolean e0() {
        return (this.zza & 524288) != 0;
    }

    public final void f0() {
        this.zzah = gz4.e;
    }

    public final /* synthetic */ void g0(zzazj zzazjVar) {
        this.zzai = zzazjVar;
        this.zzb |= 524288;
    }

    public final /* synthetic */ void h0(long j) {
        this.zzb |= 1048576;
        this.zzaj = j;
    }

    public final /* synthetic */ void i0(long j) {
        this.zzb |= 2097152;
        this.zzak = j;
    }

    public final /* synthetic */ void j0(long j) {
        this.zzb |= 4194304;
        this.zzal = j;
    }

    public final /* synthetic */ void l0(long j) {
        this.zzb |= 8388608;
        this.zzam = j;
    }

    public final /* synthetic */ void m0(long j) {
        this.zzb |= 16777216;
        this.zzan = j;
    }

    public final /* synthetic */ void n0(long j) {
        this.zzb |= C.BUFFER_FLAG_NOT_DEPENDED_ON;
        this.zzap = j;
    }

    public final /* synthetic */ void o0(long j) {
        this.zzb |= 134217728;
        this.zzaq = j;
    }

    public final void q0(zzazv zzazvVar) {
        this.zzaz = zzazvVar.a;
        this.zzc |= 16;
    }

    public final void r0(zzazv zzazvVar) {
        this.zzaA = zzazvVar.a;
        this.zzc |= 32;
    }

    public final /* synthetic */ void t0(long j) {
        this.zzc |= 2048;
        this.zzaI = j;
    }

    public final /* synthetic */ void u0(long j) {
        this.zzc |= 4096;
        this.zzaJ = j;
    }

    public final /* synthetic */ void v0(long j) {
        this.zzc |= 8192;
        this.zzaK = j;
    }

    public final /* synthetic */ void w0(long j) {
        this.zzc |= 16384;
        this.zzaL = j;
    }

    public final /* synthetic */ void y0(zzayt zzaytVar) {
        this.zzaR = zzaytVar;
        this.zzc |= 1048576;
    }

    public final /* synthetic */ void z0(long j) {
        this.zzc |= 8388608;
        this.zzaU = j;
    }

    private zzazk() {
        gz4 gz4Var = gz4.e;
        this.zzah = gz4Var;
        this.zzaj = -1L;
        this.zzak = -1L;
        this.zzal = -1L;
        this.zzam = -1L;
        this.zzan = -1L;
        this.zzao = -1L;
        this.zzap = -1L;
        this.zzaq = -1L;
        this.zzar = "D";
        this.zzas = -1L;
        this.zzay = -1L;
        this.zzaz = 1000;
        this.zzaA = 1000;
        this.zzaB = "D";
        this.zzaC = gz4Var;
        this.zzaD = 1000;
        this.zzaE = gz4Var;
        this.zzaH = "";
        this.zzaI = -1L;
        this.zzaJ = -1L;
        this.zzaK = -1L;
        this.zzaL = -1L;
        this.zzaO = -1L;
        this.zzaP = "";
        this.zzaT = -1L;
        this.zzaU = -1L;
        this.zzaW = "";
        this.zzaX = "";
        this.zzaY = -1L;
        this.zzaZ = -1L;
        this.zzbe = "";
        this.zzbf = 2;
        this.zzbh = "";
        this.zzbk = -1L;
        this.zzbl = "";
        this.zzbm = wy4.e;
        this.zzbn = -1L;
        this.zzbo = 1000;
        this.zzbp = 1000;
        this.zzbr = "";
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzayj(zzbs);
            }
            return new zzazk();
        }
        uw3 uw3Var = uw3.h;
        uw3 uw3Var2 = uw3.o;
        return new hz4(zzbs, "\u0001r\u0000\u0004\u0001Įr\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ`\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈa\u0019ဂe\u001a᠌b\u001bဈ\u0016\u001cဇc\u001dဈ\u0018\u001eဈd\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉT[ဉU\\ဂV]ဂW^᠌X_᠌@`ဉIaဂPbဈYcဈZdဂ[eဂ\\f᠌]gဂShဉ^iဇ_j'kဂil᠌jm᠌kn᠌loဈmÉဉfĭဂgĮဈh", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzbd", "zzC", "zzD", "zzbe", "zzbi", "zzbf", uw3Var, "zzE", "zzbg", "zzG", "zzbh", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzah", zzazh.class, "zzT", "zzU", "zzV", "zzW", "zzY", uw3Var2, "zzZ", uw3Var2, "zzag", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", uw3Var2, "zzai", "zzaj", "zzak", "zzal", "zzam", "zzap", "zzaq", "zzas", "zzat", uw3.n, "zzau", uw3.p, "zzar", "zzaw", uw3.g, "zzax", "zzay", "zzan", "zzao", "zzaz", uw3Var2, "zzX", "zzF", "zzaA", uw3Var2, "zzaB", "zzaC", zzazb.class, "zzaD", uw3Var2, "zzaE", zzaym.class, "zzaF", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaO", "zzaP", "zzaR", "zzaS", "zzaT", "zzaU", "zzaV", uw3.l, "zzav", uw3.i, "zzaG", "zzaN", "zzaW", "zzaX", "zzaY", "zzaZ", "zzba", uw3.m, "zzaQ", "zzbb", "zzbc", "zzbm", "zzbn", "zzbo", uw3Var2, "zzbp", uw3Var2, "zzbq", uw3.k, "zzbr", "zzbj", "zzbk", "zzbl"});
    }

    public final /* synthetic */ void C0(zzbaa zzbaaVar) {
        Objects.requireNonNull(zzbaaVar);
        this.zzbj = zzbaaVar;
        this.zzd |= 64;
    }

    public final /* synthetic */ void F(String str) {
        Objects.requireNonNull(str);
        this.zza |= 4194304;
        this.zzE = str;
    }

    public final /* synthetic */ void G(String str) {
        Objects.requireNonNull(str);
        this.zza |= 16777216;
        this.zzG = str;
    }

    public final /* synthetic */ void K(String str) {
        Objects.requireNonNull(str);
        this.zza |= 268435456;
        this.zzK = str;
    }

    public final /* synthetic */ void P0(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void Q0(String str) {
        Objects.requireNonNull(str);
        this.zza |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void U(String str) {
        Objects.requireNonNull(str);
        this.zzb |= 128;
        this.zzV = str;
    }

    public final /* synthetic */ void V(String str) {
        Objects.requireNonNull(str);
        this.zzb |= 256;
        this.zzW = str;
    }

    public final /* synthetic */ void p0(String str) {
        Objects.requireNonNull(str);
        this.zzb |= 268435456;
        this.zzar = str;
    }

    public final /* synthetic */ void s0(String str) {
        Objects.requireNonNull(str);
        this.zzc |= 1024;
        this.zzaH = str;
    }

    public final /* synthetic */ void x0(String str) {
        Objects.requireNonNull(str);
        this.zzc |= Constants.REFERRER_LINK_MAX_RESPONSE_CHARS;
        this.zzaP = str;
    }
}
