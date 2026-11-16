package com.google.android.gms.internal.measurement;

import defpackage.vo3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zziu extends zzadu implements zzafd {
    private static final zziu zzk;
    private static volatile zzafj zzl;
    private int zzb;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        zziu zziuVar = new zziu();
        zzk = zziuVar;
        zzadu.u(zziu.class, zziuVar);
    }

    public static zzit L() {
        return (zzit) zzk.q();
    }

    public final long A() {
        return this.zze;
    }

    public final String B() {
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

    public final long F() {
        return this.zzh;
    }

    public final boolean H() {
        return (this.zzb & 16) != 0;
    }

    public final float I() {
        return this.zzi;
    }

    public final boolean J() {
        return (this.zzb & 32) != 0;
    }

    public final double K() {
        return this.zzj;
    }

    public final /* synthetic */ void M(long j) {
        this.zzb |= 1;
        this.zze = j;
    }

    public final /* synthetic */ void P() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    public final /* synthetic */ void Q(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void R() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    public final /* synthetic */ void S(double d) {
        this.zzb |= 32;
        this.zzj = d;
    }

    public final /* synthetic */ void T() {
        this.zzb &= -33;
        this.zzj = 0.0d;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zziu();
        }
        if (i2 == 4) {
            return new zzit(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzl;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zziu.class) {
            try {
                zzadqVar = zzl;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzk);
                    zzl = zzadqVar;
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

    private zziu() {
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }
}
