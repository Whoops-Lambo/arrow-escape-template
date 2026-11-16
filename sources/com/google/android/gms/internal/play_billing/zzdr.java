package com.google.android.gms.internal.play_billing;

import defpackage.ec4;
import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzdr extends zzfu implements zzhc {
    private static final zzdr zzb;
    private int zzd;
    private zzeb zze;
    private zzeb zzf;
    private int zzg;

    static {
        zzdr zzdrVar = new zzdr();
        zzb = zzdrVar;
        zzfu.e(zzdr.class, zzdrVar);
    }

    public static zzdq p() {
        return (zzdq) zzb.j();
    }

    public static /* synthetic */ void q(zzdr zzdrVar, zzeb zzebVar) {
        zzdrVar.zze = zzebVar;
        zzdrVar.zzd |= 1;
    }

    public static /* synthetic */ void r(zzdr zzdrVar, zzeb zzebVar) {
        zzdrVar.zzf = zzebVar;
        zzdrVar.zzd |= 2;
    }

    public static /* synthetic */ void s(zzdr zzdrVar, int i) {
        zzdrVar.zzg = i - 1;
        zzdrVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", ec4.b});
        }
        if (i2 == 3) {
            return new zzdr();
        }
        if (i2 == 4) {
            return new zzdq(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzdr() {
    }
}
