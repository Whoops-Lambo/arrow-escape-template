package com.google.android.gms.internal.play_billing;

import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzdm extends zzfu implements zzhc {
    private static final zzdm zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzdm zzdmVar = new zzdm();
        zzb = zzdmVar;
        zzfu.e(zzdm.class, zzdmVar);
    }

    public static zzdm p(byte[] bArr) {
        return (zzdm) zzfu.m(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzdp.class});
        }
        if (i2 == 3) {
            return new zzdm();
        }
        if (i2 == 4) {
            return new zzdk(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final zzdp q() {
        return this.zzd == 2 ? (zzdp) this.zze : zzdp.p();
    }

    private zzdm() {
    }
}
