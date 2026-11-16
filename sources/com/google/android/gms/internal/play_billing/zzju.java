package com.google.android.gms.internal.play_billing;

import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzju extends zzfu implements zzhc {
    private static final zzju zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzju zzjuVar = new zzju();
        zzb = zzjuVar;
        zzfu.e(zzju.class, zzjuVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzju();
        }
        if (i2 == 4) {
            return new zzjs(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzju() {
    }
}
