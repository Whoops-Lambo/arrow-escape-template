package com.google.android.gms.internal.measurement;

import defpackage.vo3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfh extends zzadu implements zzafd {
    private static final zzfh zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private zzfr zze;
    private zzfl zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        zzfh zzfhVar = new zzfh();
        zzi = zzfhVar;
        zzadu.u(zzfh.class, zzfhVar);
    }

    public static zzfh I() {
        return zzi;
    }

    public final zzfr A() {
        zzfr zzfrVar = this.zze;
        return zzfrVar == null ? zzfr.H() : zzfrVar;
    }

    public final boolean B() {
        return (this.zzb & 2) != 0;
    }

    public final zzfl C() {
        zzfl zzflVar = this.zzf;
        return zzflVar == null ? zzfl.J() : zzflVar;
    }

    public final boolean D() {
        return (this.zzb & 4) != 0;
    }

    public final boolean E() {
        return this.zzg;
    }

    public final boolean F() {
        return (this.zzb & 8) != 0;
    }

    public final String H() {
        return this.zzh;
    }

    public final /* synthetic */ void J(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzfh();
        }
        if (i2 == 4) {
            return new zzfg(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzj;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzfh.class) {
            try {
                zzadqVar = zzj;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzi);
                    zzj = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }

    public final boolean z() {
        return (this.zzb & 1) != 0;
    }

    private zzfh() {
    }
}
