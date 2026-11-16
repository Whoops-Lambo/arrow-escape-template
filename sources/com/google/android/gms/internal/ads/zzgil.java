package com.google.android.gms.internal.ads;

import defpackage.dy4;
import defpackage.hz4;
import defpackage.jy4;
import defpackage.uw3;
import defpackage.wy4;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgil extends zzihc implements zziij {
    private static final zzgil zzf;
    private int zza;
    private Object zzc;
    private int zzd;
    private int zzb = 0;
    private zzihk zze = wy4.e;

    static {
        zzgil zzgilVar = new zzgil();
        zzf = zzgilVar;
        zzihc.z(zzgil.class, zzgilVar);
    }

    public static zzgil I(jy4 jy4Var) {
        zzgil zzgilVar = zzf;
        zzigm zzigmVar = zzigm.b;
        int i = dy4.a;
        zzihc zzihcVarS = zzihc.s(zzgilVar, jy4Var, zzigm.c);
        zzihc.D(zzihcVarS);
        return (zzgil) zzihcVarS;
    }

    public static zzgil J(byte[] bArr, zzigm zzigmVar) {
        zzihc zzihcVarC = zzihc.C(zzf, bArr, bArr.length, zzigmVar);
        zzihc.D(zzihcVarC);
        return (zzgil) zzihcVarC;
    }

    public static zzgik K() {
        return (zzgik) zzf.v();
    }

    public static zzgil L() {
        return zzf;
    }

    public final zzbfc E() {
        return this.zzb == 1 ? (zzbfc) this.zzc : zzbfc.M();
    }

    public final zzbfa F() {
        return this.zzb == 2 ? (zzbfa) this.zzc : zzbfa.H();
    }

    public final zzbet G() {
        zzbet zzbetVarA = zzbet.a(this.zzd);
        return zzbetVarA == null ? zzbet.UNSUPPORTED : zzbetVarA;
    }

    public final List H() {
        return this.zze;
    }

    public final void O(zzbet zzbetVar) {
        this.zzd = zzbetVar.a;
        this.zza |= 1;
    }

    public final void P(zzihk zzihkVar) {
        zzihk zzihkVar2 = this.zze;
        if (!zzihkVar2.zza()) {
            int size = zzihkVar2.size();
            this.zze = zzihkVar2.zzh(size + size);
        }
        zzifg.l(zzihkVar, this.zze);
    }

    private zzgil() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzgik(zzf);
            }
            return new zzgil();
        }
        return new hz4(zzf, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"zzc", "zzb", "zza", zzbfc.class, zzbfa.class, "zzd", uw3.q, "zze"});
    }

    public final /* synthetic */ void M(zzbfc zzbfcVar) {
        Objects.requireNonNull(zzbfcVar);
        this.zzc = zzbfcVar;
        this.zzb = 1;
    }

    public final /* synthetic */ void N(zzbfa zzbfaVar) {
        Objects.requireNonNull(zzbfaVar);
        this.zzc = zzbfaVar;
        this.zzb = 2;
    }
}
