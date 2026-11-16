package com.google.android.gms.internal.measurement;

import defpackage.e45;
import defpackage.vo3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zznu extends zzadu implements zzafd {
    private static final zznu zze;
    private static volatile zzafj zzf;
    private zzaew zzb = zzaew.b;

    static {
        zznu zznuVar = new zznu();
        zze = zznuVar;
        zzadu.u(zznu.class, zznuVar);
    }

    public static zznu A() {
        return zze;
    }

    public final zzaew B() {
        zzaew zzaewVar = this.zzb;
        if (!zzaewVar.a) {
            this.zzb = zzaewVar.f();
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", e45.a});
        }
        if (i2 == 3) {
            return new zznu();
        }
        if (i2 == 4) {
            return new zznt(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzf;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zznu.class) {
            try {
                zzadqVar = zzf;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zze);
                    zzf = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }

    private zznu() {
    }

    public final zznr z(String str, zznr zznrVar) {
        str.getClass();
        zznr zznrVar2 = (zznr) this.zzb.get(str);
        if (zznrVar2 != null) {
            return zznrVar2;
        }
        return zznrVar;
    }
}
