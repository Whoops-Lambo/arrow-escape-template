package com.google.android.gms.internal.ads;

import defpackage.gz4;
import defpackage.hz4;
import defpackage.oy4;
import java.io.ByteArrayInputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhvp extends zzihc implements zziij {
    private static final zzhvp zzc;
    private int zza;
    private zziho zzb = gz4.e;

    static {
        zzhvp zzhvpVar = new zzhvp();
        zzc = zzhvpVar;
        zzihc.z(zzhvp.class, zzhvpVar);
    }

    public static zzhvp H(byte[] bArr, zzigm zzigmVar) {
        zzihc zzihcVarC = zzihc.C(zzc, bArr, bArr.length, zzigmVar);
        zzihc.D(zzihcVarC);
        return (zzhvp) zzihcVarC;
    }

    public static zzhvp I(ByteArrayInputStream byteArrayInputStream, zzigm zzigmVar) throws zzihu {
        zzihc zzihcVarR = zzihc.r(zzc, new oy4(byteArrayInputStream), zzigmVar);
        zzihc.D(zzihcVarR);
        return (zzhvp) zzihcVarR;
    }

    public static zzhvm J() {
        return (zzhvm) zzc.v();
    }

    public final int E() {
        return this.zza;
    }

    public final List F() {
        return this.zzb;
    }

    public final int G() {
        return this.zzb.size();
    }

    public final /* synthetic */ void K(int i) {
        this.zza = i;
    }

    public final void L(zzhvo zzhvoVar) {
        zziho zzihoVar = this.zzb;
        if (!zzihoVar.zza()) {
            int size = zzihoVar.size();
            this.zzb = zzihoVar.zzh(size + size);
        }
        this.zzb.add(zzhvoVar);
    }

    private zzhvp() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhvm(zzc);
            }
            return new zzhvp();
        }
        return new hz4(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhvo.class});
    }
}
