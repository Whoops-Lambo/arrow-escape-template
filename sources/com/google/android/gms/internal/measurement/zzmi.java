package com.google.android.gms.internal.measurement;

import defpackage.lm3;
import defpackage.vo3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzmi extends zzadu implements zzafd {
    private static final zzmi zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    public final /* synthetic */ void J(long j) {
        this.zze = 1;
        this.zzf = Long.valueOf(j);
    }

    public final /* synthetic */ void K(boolean z) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z);
    }

    public final /* synthetic */ void L(double d) {
        this.zze = 3;
        this.zzf = Double.valueOf(d);
    }

    static {
        zzmi zzmiVar = new zzmi();
        zzh = zzmiVar;
        zzadu.u(zzmi.class, zzmiVar);
    }

    public static zzmh F() {
        return (zzmh) zzh.q();
    }

    public static zzmi H() {
        return zzh;
    }

    public final long A() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean B() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double C() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String D() {
        return this.zze == 4 ? (String) this.zzf : "";
    }

    public final zzacr E() {
        return this.zze == 5 ? (zzacr) this.zzf : zzacr.b;
    }

    public final int O() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new zzmi();
        }
        if (i2 == 4) {
            return new zzmh(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzi;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzmi.class) {
            try {
                zzadqVar = zzi;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzh);
                    zzi = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }

    public final String z() {
        return this.zzg;
    }

    private zzmi() {
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void M(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    public final /* synthetic */ void N(lm3 lm3Var) {
        lm3Var.getClass();
        this.zze = 5;
        this.zzf = lm3Var;
    }
}
