package com.google.android.gms.internal.play_billing;

import defpackage.ec4;
import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzja extends zzfu implements zzhc {
    private static final zzja zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        zzja zzjaVar = new zzja();
        zzb = zzjaVar;
        zzfu.e(zzja.class, zzjaVar);
    }

    public static /* synthetic */ void p(zzja zzjaVar, int i) {
        zzjaVar.zzg = i - 1;
        zzjaVar.zzd |= 1;
    }

    public static zziy q() {
        return (zziy) zzb.j();
    }

    public static void s(zzja zzjaVar, zzjk zzjkVar) {
        zzjaVar.zzh = zzjkVar.a;
        zzjaVar.zzd |= 2;
    }

    public static /* synthetic */ void t(zzja zzjaVar, zzjy zzjyVar) {
        zzjaVar.zzf = zzjyVar;
        zzjaVar.zze = 2;
    }

    public static /* synthetic */ void u(zzja zzjaVar, zzke zzkeVar) {
        zzjaVar.zzf = zzkeVar;
        zzjaVar.zze = 4;
    }

    public static /* synthetic */ void v(zzja zzjaVar, zzku zzkuVar) {
        zzjaVar.zzf = zzkuVar;
        zzjaVar.zze = 3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", ec4.c, zzjy.class, zzku.class, zzke.class, "zzh", ec4.e});
        }
        if (i2 == 3) {
            return new zzja();
        }
        if (i2 == 4) {
            return new zziy(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final zzke r() {
        return this.zze == 4 ? (zzke) this.zzf : zzke.p();
    }

    private zzja() {
    }
}
