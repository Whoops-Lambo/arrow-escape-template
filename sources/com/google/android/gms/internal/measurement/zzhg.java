package com.google.android.gms.internal.measurement;

import defpackage.vo3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzhg extends zzadu implements zzafd {
    private static final zzhg zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private int zze;
    private zzii zzf;
    private zzii zzg;
    private boolean zzh;

    static {
        zzhg zzhgVar = new zzhg();
        zzi = zzhgVar;
        zzadu.u(zzhg.class, zzhgVar);
    }

    public static zzhf H() {
        return (zzhf) zzi.q();
    }

    public final int A() {
        return this.zze;
    }

    public final zzii B() {
        zzii zziiVar = this.zzf;
        return zziiVar == null ? zzii.J() : zziiVar;
    }

    public final boolean C() {
        return (this.zzb & 4) != 0;
    }

    public final zzii D() {
        zzii zziiVar = this.zzg;
        return zziiVar == null ? zzii.J() : zziiVar;
    }

    public final boolean E() {
        return (this.zzb & 8) != 0;
    }

    public final boolean F() {
        return this.zzh;
    }

    public final /* synthetic */ void I(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void J(zzii zziiVar) {
        this.zzf = zziiVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void K(zzii zziiVar) {
        this.zzg = zziiVar;
        this.zzb |= 4;
    }

    public final /* synthetic */ void L(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzhg();
        }
        if (i2 == 4) {
            return new zzhf(zzi);
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
        synchronized (zzhg.class) {
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

    private zzhg() {
    }
}
