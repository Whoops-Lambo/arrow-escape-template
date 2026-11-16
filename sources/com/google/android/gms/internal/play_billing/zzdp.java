package com.google.android.gms.internal.play_billing;

import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzdp extends zzfu implements zzhc {
    private static final zzdp zzb;
    private int zzd;
    private String zze = "";

    static {
        zzdp zzdpVar = new zzdp();
        zzb = zzdpVar;
        zzfu.e(zzdp.class, zzdpVar);
    }

    public static zzdp p() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzdp();
        }
        if (i2 == 4) {
            return new zzdn(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final String q() {
        return this.zze;
    }

    private zzdp() {
    }
}
