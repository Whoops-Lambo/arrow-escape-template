package com.google.android.gms.internal.consent_sdk;

import defpackage.o75;
import defpackage.p75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzhc extends zzqm implements zzrr {
    private static final zzhc zzb;
    private int zzd;
    private zzgy zze;
    private zzha zzg;
    private zzgw zzh;
    private zzgt zzi;
    private String zzf = "";
    private zzqr zzj = o75.e;

    static {
        zzhc zzhcVar = new zzhc();
        zzb = zzhcVar;
        zzqm.m(zzhc.class, zzhcVar);
    }

    public static zzgu n() {
        return (zzgu) zzb.h();
    }

    public static /* synthetic */ void p(zzhc zzhcVar, String str) {
        zzhcVar.zzd |= 2;
        zzhcVar.zzf = str;
    }

    public static /* synthetic */ void q(zzhc zzhcVar, zzgt zzgtVar) {
        zzhcVar.zzi = zzgtVar;
        zzhcVar.zzd |= 16;
    }

    public static /* synthetic */ void r(zzhc zzhcVar, zzgw zzgwVar) {
        zzhcVar.zzh = zzgwVar;
        zzhcVar.zzd |= 8;
    }

    public static /* synthetic */ void s(zzhc zzhcVar, zzgy zzgyVar) {
        zzhcVar.zze = zzgyVar;
        zzhcVar.zzd |= 1;
    }

    public static /* synthetic */ void t(zzhc zzhcVar, zzha zzhaVar) {
        zzhcVar.zzg = zzhaVar;
        zzhcVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new p75(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ț", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzhc();
        }
        if (i2 == 4) {
            return new zzgu(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    private zzhc() {
    }

    public static /* synthetic */ void o(zzhc zzhcVar, String str) {
        str.getClass();
        zzqr zzqrVar = zzhcVar.zzj;
        if (!zzqrVar.zzc()) {
            int size = zzqrVar.size();
            zzhcVar.zzj = zzqrVar.zzd(size + size);
        }
        zzhcVar.zzj.add(str);
    }
}
