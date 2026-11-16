package com.google.android.gms.internal.play_billing;

import defpackage.ec4;
import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzjf extends zzfu implements zzhc {
    private static final zzjf zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        zzjf zzjfVar = new zzjf();
        zzb = zzjfVar;
        zzfu.e(zzjf.class, zzjfVar);
    }

    public static /* synthetic */ void p(zzjf zzjfVar, int i) {
        zzjfVar.zzd |= 1;
        zzjfVar.zze = i;
    }

    public static zzjb q() {
        return (zzjb) zzb.j();
    }

    public static /* synthetic */ void r(zzjf zzjfVar, String str) {
        zzjfVar.zzd |= 8;
        zzjfVar.zzh = str;
    }

    public static /* synthetic */ void t(zzjf zzjfVar) {
        zzjfVar.zzd |= 32;
        zzjfVar.zzj = 0;
    }

    public static /* synthetic */ void u(zzjf zzjfVar, int i) {
        zzjfVar.zzd |= 16;
        zzjfVar.zzi = i;
    }

    public static void v(zzjf zzjfVar, zzjd zzjdVar) {
        zzjfVar.zzg = zzjdVar.a;
        zzjfVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", ec4.d, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzjf();
        }
        if (i2 == 4) {
            return new zzjb(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzjf() {
    }

    public static /* synthetic */ void s(zzjf zzjfVar, String str) {
        str.getClass();
        zzjfVar.zzd |= 2;
        zzjfVar.zzf = str;
    }
}
