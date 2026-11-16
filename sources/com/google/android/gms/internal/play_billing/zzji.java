package com.google.android.gms.internal.play_billing;

import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzji extends zzfu implements zzhc {
    private static final zzji zzb;

    static {
        zzji zzjiVar = new zzji();
        zzb = zzjiVar;
        zzfu.e(zzji.class, zzjiVar);
    }

    public static zzji p() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new zzji();
        }
        if (i2 == 4) {
            return new zzjg(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzji() {
    }
}
