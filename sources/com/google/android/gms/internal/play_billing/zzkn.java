package com.google.android.gms.internal.play_billing;

import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzkn extends zzfu implements zzhc {
    private static final zzkn zzb;
    private int zzd;
    private zzjf zze;
    private long zzf;

    static {
        zzkn zzknVar = new zzkn();
        zzb = zzknVar;
        zzfu.e(zzkn.class, zzknVar);
    }

    public static zzkl p() {
        return (zzkl) zzb.j();
    }

    public static /* synthetic */ void q(zzkn zzknVar, zzjf zzjfVar) {
        zzknVar.zze = zzjfVar;
        zzknVar.zzd |= 1;
    }

    public static /* synthetic */ void r(zzkn zzknVar, long j) {
        zzknVar.zzd |= 2;
        zzknVar.zzf = j;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzkn();
        }
        if (i2 == 4) {
            return new zzkl(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzkn() {
    }
}
