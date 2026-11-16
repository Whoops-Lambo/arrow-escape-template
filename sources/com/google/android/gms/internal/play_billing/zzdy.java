package com.google.android.gms.internal.play_billing;

import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdy extends zzfu implements zzhc {
    private static final zzdy zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzdy zzdyVar = new zzdy();
        zzb = zzdyVar;
        zzfu.e(zzdy.class, zzdyVar);
    }

    public static zzdx p() {
        return (zzdx) zzb.j();
    }

    public static /* synthetic */ void q(zzdy zzdyVar, String str) {
        zzdyVar.zzd |= 4;
        zzdyVar.zzg = str;
    }

    public static /* synthetic */ void u(zzdy zzdyVar) {
        zzdyVar.zzd |= 1;
        zzdyVar.zze = 24;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzdy();
        }
        if (i2 == 4) {
            return new zzdx(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzdy() {
    }

    public static /* synthetic */ void r(zzdy zzdyVar, String str) {
        str.getClass();
        zzdyVar.zzd |= 16;
        zzdyVar.zzi = str;
    }

    public static /* synthetic */ void s(zzdy zzdyVar, String str) {
        str.getClass();
        zzdyVar.zzd |= 32;
        zzdyVar.zzj = str;
    }

    public static /* synthetic */ void t(zzdy zzdyVar, String str) {
        str.getClass();
        zzdyVar.zzd |= 8;
        zzdyVar.zzh = str;
    }
}
