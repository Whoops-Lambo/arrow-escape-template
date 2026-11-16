package com.google.android.gms.internal.measurement;

import defpackage.to3;
import defpackage.vo3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzgh extends zzadu implements zzafd {
    private static final zzgh zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private String zze = "";
    private zzaef zzf = to3.e;
    private boolean zzg;

    static {
        zzgh zzghVar = new zzgh();
        zzh = zzghVar;
        zzadu.u(zzgh.class, zzghVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zze", "zzf", zzgr.class, "zzg"});
        }
        if (i2 == 3) {
            return new zzgh();
        }
        if (i2 == 4) {
            return new zzgg(zzh);
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
        synchronized (zzgh.class) {
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
        return this.zze;
    }

    private zzgh() {
    }
}
