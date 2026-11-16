package com.google.android.gms.internal.play_billing;

import android.os.Build;
import defpackage.lv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzjr extends zzfu implements zzhc {
    private static final zzjr zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        zzjr zzjrVar = new zzjr();
        zzb = zzjrVar;
        zzfu.e(zzjr.class, zzjrVar);
    }

    public static /* synthetic */ void A(zzjr zzjrVar, int i) {
        zzjrVar.zzd |= 128;
        zzjrVar.zzl = i;
    }

    public static /* synthetic */ void B(zzjr zzjrVar, int i) {
        zzjrVar.zzd |= 256;
        zzjrVar.zzm = i;
    }

    public static /* synthetic */ void C(zzjr zzjrVar, int i) {
        zzjrVar.zzd |= 8;
        zzjrVar.zzh = i;
    }

    public static /* synthetic */ void D(zzjr zzjrVar, long j) {
        zzjrVar.zzd |= 16;
        zzjrVar.zzi = j;
    }

    public static /* synthetic */ void E(zzjr zzjrVar, long j) {
        zzjrVar.zzd |= 32;
        zzjrVar.zzj = j;
    }

    public static /* synthetic */ void p(zzjr zzjrVar) {
        zzjrVar.zzd |= 512;
        zzjrVar.zzn = 846465066L;
    }

    public static /* synthetic */ void r(zzjr zzjrVar) {
        String str = Build.BRAND;
        str.getClass();
        zzjrVar.zzd |= 1024;
        zzjrVar.zzo = str;
    }

    public static /* synthetic */ void s(zzjr zzjrVar) {
        String str = Build.FINGERPRINT;
        str.getClass();
        zzjrVar.zzd |= 8192;
        zzjrVar.zzr = str;
    }

    public static /* synthetic */ void t(zzjr zzjrVar) {
        String str = Build.MANUFACTURER;
        str.getClass();
        zzjrVar.zzd |= 4096;
        zzjrVar.zzq = str;
    }

    public static /* synthetic */ void u(zzjr zzjrVar) {
        String str = Build.MODEL;
        str.getClass();
        zzjrVar.zzd |= 2048;
        zzjrVar.zzp = str;
    }

    public static /* synthetic */ void v(zzjr zzjrVar, int i) {
        zzjrVar.zzd |= 16384;
        zzjrVar.zzs = i;
    }

    public static /* synthetic */ void w(zzjr zzjrVar, boolean z) {
        zzjrVar.zzd |= 64;
        zzjrVar.zzk = z;
    }

    public static /* synthetic */ void y(zzjr zzjrVar, String str) {
        zzjrVar.zzd |= 2;
        zzjrVar.zzf = str;
    }

    public static zzjp z() {
        return (zzjp) zzb.j();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    public final Object i(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lv4(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new zzjr();
        }
        if (i2 == 4) {
            return new zzjp(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzjr() {
    }

    public static /* synthetic */ void q(zzjr zzjrVar, String str) {
        str.getClass();
        zzjrVar.zzd |= 4;
        zzjrVar.zzg = str;
    }

    public static /* synthetic */ void x(zzjr zzjrVar, String str) {
        str.getClass();
        zzjrVar.zzd |= 1;
        zzjrVar.zze = str;
    }
}
