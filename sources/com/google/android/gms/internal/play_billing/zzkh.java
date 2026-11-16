package com.google.android.gms.internal.play_billing;

import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzkh extends zzfu implements zzhc {
    private static final zzkh zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zzjr zzg;
    private zzju zzh;

    static {
        zzkh zzkhVar = new zzkh();
        zzb = zzkhVar;
        zzfu.e(zzkh.class, zzkhVar);
    }

    public static /* synthetic */ void p(zzkh zzkhVar, zzkr zzkrVar) {
        zzkhVar.zzf = zzkrVar;
        zzkhVar.zze = 4;
    }

    public static zzkf q() {
        return (zzkf) zzb.j();
    }

    public static /* synthetic */ void r(zzkh zzkhVar, zziw zziwVar) {
        zzkhVar.zzf = zziwVar;
        zzkhVar.zze = 2;
    }

    public static /* synthetic */ void s(zzkh zzkhVar, zzja zzjaVar) {
        zzkhVar.zzf = zzjaVar;
        zzkhVar.zze = 3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zziw.class, zzja.class, zzkr.class, zzjo.class, "zzh", zzji.class, zzkn.class});
        }
        if (i2 == 3) {
            return new zzkh();
        }
        if (i2 == 4) {
            return new zzkf(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzkh() {
    }

    public static /* synthetic */ void t(zzkh zzkhVar, zzji zzjiVar) {
        zzjiVar.getClass();
        zzkhVar.zzf = zzjiVar;
        zzkhVar.zze = 7;
    }

    public static /* synthetic */ void u(zzkh zzkhVar, zzjr zzjrVar) {
        zzjrVar.getClass();
        zzkhVar.zzg = zzjrVar;
        zzkhVar.zzd |= 1;
    }

    public static /* synthetic */ void v(zzkh zzkhVar, zzkn zzknVar) {
        zzknVar.getClass();
        zzkhVar.zzf = zzknVar;
        zzkhVar.zze = 8;
    }
}
