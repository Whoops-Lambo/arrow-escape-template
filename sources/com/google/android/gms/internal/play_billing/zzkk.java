package com.google.android.gms.internal.play_billing;

import defpackage.iv4;
import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzkk extends zzfu implements zzhc {
    private static final zzkk zzb;
    private int zzd;
    private int zzf;
    private zzfz zze = iv4.e;
    private String zzg = "";

    static {
        zzkk zzkkVar = new zzkk();
        zzb = zzkkVar;
        zzfu.e(zzkk.class, zzkkVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzkk();
        }
        if (i2 == 4) {
            return new zzki(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzkk() {
    }
}
