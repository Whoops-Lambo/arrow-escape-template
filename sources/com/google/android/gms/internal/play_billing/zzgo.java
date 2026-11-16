package com.google.android.gms.internal.play_billing;

import defpackage.iv4;
import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgo extends zzfu implements zzhc {
    private static final zzgo zzb;
    private zzfz zzd = iv4.e;

    static {
        zzgo zzgoVar = new zzgo();
        zzb = zzgoVar;
        zzfu.e(zzgo.class, zzgoVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zziq.class});
        }
        if (i2 == 3) {
            return new zzgo();
        }
        if (i2 == 4) {
            return new zzgm(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzgo() {
    }
}
