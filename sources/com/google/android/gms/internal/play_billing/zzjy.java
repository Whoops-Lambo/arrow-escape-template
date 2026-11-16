package com.google.android.gms.internal.play_billing;

import defpackage.ec4;
import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzjy extends zzfu implements zzhc {
    private static final zzjy zzb;
    private int zzd;
    private int zze;

    static {
        zzjy zzjyVar = new zzjy();
        zzb = zzjyVar;
        zzfu.e(zzjy.class, zzjyVar);
    }

    public static zzjv p() {
        return (zzjv) zzb.j();
    }

    public static /* synthetic */ void q(zzjy zzjyVar, int i) {
        zzjyVar.zze = i - 1;
        zzjyVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", ec4.g});
        }
        if (i2 == 3) {
            return new zzjy();
        }
        if (i2 == 4) {
            return new zzjv(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzjy() {
    }
}
