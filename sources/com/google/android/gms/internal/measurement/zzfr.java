package com.google.android.gms.internal.measurement;

import defpackage.am3;
import defpackage.to3;
import defpackage.vo3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfr extends zzadu implements zzafd {
    private static final zzfr zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private zzaef zzh = to3.e;

    static {
        zzfr zzfrVar = new zzfr();
        zzi = zzfrVar;
        zzadu.u(zzfr.class, zzfrVar);
    }

    public static zzfr H() {
        return zzi;
    }

    public final boolean A() {
        return (this.zzb & 2) != 0;
    }

    public final String B() {
        return this.zzf;
    }

    public final boolean C() {
        return (this.zzb & 4) != 0;
    }

    public final boolean D() {
        return this.zzg;
    }

    public final zzaef E() {
        return this.zzh;
    }

    public final int F() {
        return this.zzh.size();
    }

    public final int I() {
        int i;
        switch (this.zze) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", am3.d, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzfr();
        }
        if (i2 == 4) {
            return new zzfo(zzi);
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
        synchronized (zzfr.class) {
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

    private zzfr() {
    }
}
