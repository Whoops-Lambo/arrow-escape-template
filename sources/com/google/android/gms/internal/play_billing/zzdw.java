package com.google.android.gms.internal.play_billing;

import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdw extends zzfu implements zzhc {
    private static final zzdw zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzdw zzdwVar = new zzdw();
        zzb = zzdwVar;
        zzfu.e(zzdw.class, zzdwVar);
    }

    public static zzdw q(byte[] bArr) {
        return (zzdw) zzfu.m(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzdw();
        }
        if (i2 == 4) {
            return new zzdv(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int p() {
        return this.zze;
    }

    public final String r() {
        return this.zzf;
    }

    private zzdw() {
    }
}
