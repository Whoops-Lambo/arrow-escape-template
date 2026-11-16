package com.google.android.gms.internal.play_billing;

import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzeb extends zzfu implements zzhc {
    private static final zzeb zzb;
    private int zzd;
    private String zze = "";

    static {
        zzeb zzebVar = new zzeb();
        zzb = zzebVar;
        zzfu.e(zzeb.class, zzebVar);
    }

    public static zzea p() {
        return (zzea) zzb.j();
    }

    public static /* synthetic */ void q(zzeb zzebVar, String str) {
        zzebVar.zzd |= 1;
        zzebVar.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzeb();
        }
        if (i2 == 4) {
            return new zzea(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzeb() {
    }
}
