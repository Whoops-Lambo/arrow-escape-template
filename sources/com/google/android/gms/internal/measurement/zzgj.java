package com.google.android.gms.internal.measurement;

import defpackage.vo3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzgj extends zzadu implements zzafd {
    private static final zzgj zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzgj zzgjVar = new zzgj();
        zzi = zzgjVar;
        zzadu.u(zzgj.class, zzgjVar);
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

    public final boolean D() {
        return this.zzg;
    }

    public final boolean E() {
        return (this.zzb & 8) != 0;
    }

    public final int F() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgj();
        }
        if (i2 == 4) {
            return new zzgi(zzi);
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
        synchronized (zzgj.class) {
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

    public final String z() {
        return this.zze;
    }

    private zzgj() {
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }
}
