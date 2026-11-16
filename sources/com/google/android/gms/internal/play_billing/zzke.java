package com.google.android.gms.internal.play_billing;

import defpackage.iv4;
import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzke extends zzfu implements zzhc {
    private static final zzke zzb;
    private int zzd;
    private zzfz zze = iv4.e;
    private String zzf = "";
    private boolean zzg;

    static {
        zzke zzkeVar = new zzke();
        zzb = zzkeVar;
        zzfu.e(zzke.class, zzkeVar);
    }

    public static zzke p() {
        return zzb;
    }

    public static /* synthetic */ void q(zzke zzkeVar, boolean z) {
        zzkeVar.zzd |= 2;
        zzkeVar.zzg = z;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", zzkc.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzke();
        }
        if (i2 == 4) {
            return new zzjz(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzke() {
    }
}
