package com.google.android.gms.internal.measurement;

import defpackage.vo3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfn extends zzadu implements zzafd {
    private static final zzfn zzk;
    private static volatile zzafj zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private zzfh zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzfn zzfnVar = new zzfn();
        zzk = zzfnVar;
        zzadu.u(zzfn.class, zzfnVar);
    }

    public static zzfm I() {
        return (zzfm) zzk.q();
    }

    public final int A() {
        return this.zze;
    }

    public final String B() {
        return this.zzf;
    }

    public final zzfh C() {
        zzfh zzfhVar = this.zzg;
        return zzfhVar == null ? zzfh.I() : zzfhVar;
    }

    public final boolean D() {
        return this.zzh;
    }

    public final boolean E() {
        return this.zzi;
    }

    public final boolean F() {
        return (this.zzb & 32) != 0;
    }

    public final boolean H() {
        return this.zzj;
    }

    public final /* synthetic */ void J(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzfn();
        }
        if (i2 == 4) {
            return new zzfm(zzk);
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
        synchronized (zzfn.class) {
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

    private zzfn() {
    }
}
