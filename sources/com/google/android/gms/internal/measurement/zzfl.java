package com.google.android.gms.internal.measurement;

import defpackage.am3;
import defpackage.vo3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfl extends zzadu implements zzafd {
    private static final zzfl zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzfl zzflVar = new zzfl();
        zzj = zzflVar;
        zzadu.u(zzfl.class, zzflVar);
    }

    public static zzfl J() {
        return zzj;
    }

    public final boolean A() {
        return (this.zzb & 2) != 0;
    }

    public final boolean B() {
        return this.zzf;
    }

    public final boolean C() {
        return (this.zzb & 4) != 0;
    }

    public final String D() {
        return this.zzg;
    }

    public final boolean E() {
        return (this.zzb & 8) != 0;
    }

    public final String F() {
        return this.zzh;
    }

    public final boolean H() {
        return (this.zzb & 16) != 0;
    }

    public final String I() {
        return this.zzi;
    }

    public final int K() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
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
            return new vo3(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", am3.c, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzfl();
        }
        if (i2 == 4) {
            return new zzfi(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzk;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzfl.class) {
            try {
                zzadqVar = zzk;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzj);
                    zzk = zzadqVar;
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

    private zzfl() {
    }
}
