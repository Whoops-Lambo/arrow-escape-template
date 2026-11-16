package com.google.android.gms.internal.play_billing;

import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzku extends zzfu implements zzhc {
    private static final zzku zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        zzku zzkuVar = new zzku();
        zzb = zzkuVar;
        zzfu.e(zzku.class, zzkuVar);
    }

    public static zzks p() {
        return (zzks) zzb.j();
    }

    public static /* synthetic */ void q(zzku zzkuVar, boolean z) {
        zzkuVar.zzd |= 8;
        zzkuVar.zzh = z;
    }

    public static /* synthetic */ void r(zzku zzkuVar, int i) {
        zzkuVar.zzd |= 16;
        zzkuVar.zzi = i;
    }

    public static /* synthetic */ void s(zzku zzkuVar, long j) {
        zzkuVar.zzd |= 4;
        zzkuVar.zzg = j;
    }

    public static /* synthetic */ void t(zzku zzkuVar) {
        zzkuVar.zzd |= 32;
        zzkuVar.zzj = 0;
    }

    public static /* synthetic */ void u(zzku zzkuVar) {
        zzkuVar.zzd |= 2;
        zzkuVar.zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzku();
        }
        if (i2 == 4) {
            return new zzks(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzku() {
    }
}
