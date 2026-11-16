package com.google.android.gms.internal.ads;

import defpackage.dy4;
import defpackage.hz4;
import defpackage.oy4;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzgdp extends zzihc implements zziij {
    private static final zzgdp zzb;
    private zziid zza = zziid.b;

    static {
        zzgdp zzgdpVar = new zzgdp();
        zzb = zzgdpVar;
        zzihc.z(zzgdp.class, zzgdpVar);
    }

    public static zzgdp G(FileInputStream fileInputStream) throws zzihu {
        zzgdp zzgdpVar = zzb;
        oy4 oy4Var = new oy4(fileInputStream);
        zzigm zzigmVar = zzigm.b;
        int i = dy4.a;
        zzihc zzihcVarR = zzihc.r(zzgdpVar, oy4Var, zzigm.c);
        zzihc.D(zzihcVarR);
        return (zzgdp) zzihcVarR;
    }

    public static zzgdp H() {
        return zzb;
    }

    public final int E() {
        return this.zza.size();
    }

    public final Map F() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final zziid I() {
        zziid zziidVar = this.zza;
        if (!zziidVar.a) {
            this.zza = zziidVar.f();
        }
        return this.zza;
    }

    private zzgdp() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzgdo(zzb);
            }
            return new zzgdp();
        }
        return new hz4(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", new zziic(zzijx.c, zzijx.e, zzgdm.V())});
    }
}
