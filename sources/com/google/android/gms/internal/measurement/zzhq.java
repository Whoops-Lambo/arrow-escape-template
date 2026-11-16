package com.google.android.gms.internal.measurement;

import defpackage.vo3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzhq extends zzadu implements zzafd {
    private static final zzhq zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private long zzf;

    static {
        zzhq zzhqVar = new zzhq();
        zzg = zzhqVar;
        zzadu.u(zzhq.class, zzhqVar);
    }

    public static zzhp D() {
        return (zzhp) zzg.q();
    }

    public final int A() {
        return this.zze;
    }

    public final boolean B() {
        return (this.zzb & 2) != 0;
    }

    public final long C() {
        return this.zzf;
    }

    public final /* synthetic */ void E(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzhq();
        }
        if (i2 == 4) {
            return new zzhp(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzh;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzhq.class) {
            try {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
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

    private zzhq() {
    }
}
