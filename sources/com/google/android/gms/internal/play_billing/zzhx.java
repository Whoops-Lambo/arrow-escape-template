package com.google.android.gms.internal.play_billing;

import defpackage.lv4;
import defpackage.vw4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhx extends zzfu implements zzhc {
    private static final zzhx zzb;
    private zzgv zzd = zzgv.b;

    static {
        zzhx zzhxVar = new zzhx();
        zzb = zzhxVar;
        zzfu.e(zzhx.class, zzhxVar);
    }

    public static zzhu p() {
        return (zzhu) zzb.j();
    }

    public static zzgv q(zzhx zzhxVar) {
        zzgv zzgvVar = zzhxVar.zzd;
        if (!zzgvVar.a) {
            zzhxVar.zzd = zzgvVar.f();
        }
        return zzhxVar.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zzd", vw4.a});
        }
        if (i2 == 3) {
            return new zzhx();
        }
        if (i2 == 4) {
            return new zzhu(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzhx() {
    }
}
