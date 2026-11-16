package com.google.android.gms.internal.ads;

import defpackage.hz4;
import defpackage.jy4;
import defpackage.uw3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgij extends zzihc implements zziij {
    private static final zzgij zzf;
    private int zza;
    private zzgil zzb;
    private zzifx zzc;
    private zzifx zzd;
    private int zze;

    static {
        zzgij zzgijVar = new zzgij();
        zzf = zzgijVar;
        zzihc.z(zzgij.class, zzgijVar);
    }

    public static zzgii H() {
        return (zzgii) zzf.v();
    }

    public final zzgil E() {
        zzgil zzgilVar = this.zzb;
        return zzgilVar == null ? zzgil.L() : zzgilVar;
    }

    public final zzifx F() {
        return this.zzc;
    }

    public final zzifx G() {
        return this.zzd;
    }

    public final /* synthetic */ void I(zzgil zzgilVar) {
        this.zzb = zzgilVar;
        this.zza |= 1;
    }

    public final int L() {
        int iA = zzgja.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final /* synthetic */ void M(int i) {
        this.zze = i - 1;
        this.zza |= 8;
    }

    private zzgij() {
        jy4 jy4Var = zzifx.b;
        this.zzc = jy4Var;
        this.zzd = jy4Var;
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzgii(zzf);
            }
            return new zzgij();
        }
        return new hz4(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", uw3.u});
    }

    public final /* synthetic */ void J(zzifx zzifxVar) {
        Objects.requireNonNull(zzifxVar);
        this.zza |= 2;
        this.zzc = zzifxVar;
    }

    public final /* synthetic */ void K(zzifx zzifxVar) {
        Objects.requireNonNull(zzifxVar);
        this.zza |= 4;
        this.zzd = zzifxVar;
    }
}
