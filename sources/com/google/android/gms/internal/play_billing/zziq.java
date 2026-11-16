package com.google.android.gms.internal.play_billing;

import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zziq extends zzfu implements zzhc {
    private static final zziq zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zziq zziqVar = new zziq();
        zzb = zziqVar;
        zzfu.e(zziq.class, zziqVar);
    }

    public static zzio p() {
        return (zzio) zzb.j();
    }

    public static zziq q() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"zze", "zzd", zzhx.class, zzgo.class});
        }
        if (i2 == 3) {
            return new zziq();
        }
        if (i2 == 4) {
            return new zzio(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zziq() {
    }

    public static /* synthetic */ void r(zziq zziqVar, String str) {
        str.getClass();
        zziqVar.zzd = 3;
        zziqVar.zze = str;
    }
}
