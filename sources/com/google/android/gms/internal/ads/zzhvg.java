package com.google.android.gms.internal.ads;

import defpackage.hz4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhvg extends zzihc implements zziij {
    private static final zzhvg zzd;
    private String zza = "";
    private zzifx zzb = zzifx.b;
    private int zzc;

    static {
        zzhvg zzhvgVar = new zzhvg();
        zzd = zzhvgVar;
        zzihc.z(zzhvg.class, zzhvgVar);
    }

    public static zzhvf G() {
        return (zzhvf) zzd.v();
    }

    public static zzhvg H() {
        return zzd;
    }

    public final String E() {
        return this.zza;
    }

    public final zzifx F() {
        return this.zzb;
    }

    public final int K() {
        int i = this.zzc;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i == 2) {
                i2 = 4;
            } else if (i != 3) {
                i2 = i != 4 ? 0 : 6;
            } else {
                i2 = 5;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final /* synthetic */ void L(int i) {
        this.zzc = i - 2;
    }

    private zzhvg() {
    }

    @Override // com.google.android.gms.internal.ads.zzihc
    public final Object A(zzihb zzihbVar, zzihc zzihcVar) {
        int iOrdinal = zzihbVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    return null;
                }
                return new zzhvf(zzd);
            }
            return new zzhvg();
        }
        return new hz4(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
    }

    public final /* synthetic */ void I(String str) {
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final /* synthetic */ void J(zzifx zzifxVar) {
        Objects.requireNonNull(zzifxVar);
        this.zzb = zzifxVar;
    }
}
