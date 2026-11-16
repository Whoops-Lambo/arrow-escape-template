package com.google.android.gms.internal.play_billing;

import defpackage.ec4;
import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zziw extends zzfu implements zzhc {
    private static final zziw zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private zzjf zzh;
    private int zzi;

    static {
        zziw zziwVar = new zziw();
        zzb = zziwVar;
        zzfu.e(zziw.class, zziwVar);
    }

    public static /* synthetic */ void p(zziw zziwVar, zzke zzkeVar) {
        zziwVar.zzf = zzkeVar;
        zziwVar.zze = 7;
    }

    public static /* synthetic */ void q(zziw zziwVar, zzku zzkuVar) {
        zziwVar.zzf = zzkuVar;
        zziwVar.zze = 6;
    }

    public static /* synthetic */ void r(zziw zziwVar, int i) {
        zziwVar.zzg = i - 1;
        zziwVar.zzd |= 1;
    }

    public static zziu s() {
        return (zziu) zzb.j();
    }

    public static zziw t(byte[] bArr) {
        return (zziw) zzfu.m(zzb, bArr);
    }

    public static void v(zziw zziwVar, zzjk zzjkVar) {
        zziwVar.zzi = zzjkVar.a;
        zziwVar.zzd |= 4;
    }

    public static /* synthetic */ void w(zziw zziwVar, zzjf zzjfVar) {
        zziwVar.zzh = zzjfVar;
        zziwVar.zzd |= 2;
    }

    public static /* synthetic */ void x(zziw zziwVar, zzjy zzjyVar) {
        zziwVar.zzf = zzjyVar;
        zziwVar.zze = 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", ec4.c, "zzh", zzjy.class, "zzi", ec4.e, zzku.class, zzke.class});
        }
        if (i2 == 3) {
            return new zziw();
        }
        if (i2 == 4) {
            return new zziu(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final zzke u() {
        return this.zze == 7 ? (zzke) this.zzf : zzke.p();
    }

    private zziw() {
    }
}
