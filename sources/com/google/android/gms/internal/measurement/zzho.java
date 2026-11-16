package com.google.android.gms.internal.measurement;

import defpackage.rl3;
import defpackage.to3;
import defpackage.vo3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzho extends zzadu implements zzafd {
    private static final zzho zze;
    private static volatile zzafj zzf;
    private zzaef zzb = to3.e;

    static {
        zzho zzhoVar = new zzho();
        zze = zzhoVar;
        zzadu.u(zzho.class, zzhoVar);
    }

    public static zzhh A() {
        return (zzhh) zze.q();
    }

    public static zzho B() {
        return zze;
    }

    public final void C(ArrayList arrayList) {
        zzaef zzaefVar = this.zzb;
        if (!zzaefVar.zza()) {
            this.zzb = rl3.j(zzaefVar);
        }
        zzacb.k(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object y(int i) {
        zzafj zzadqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vo3(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzhl.class});
        }
        if (i2 == 3) {
            return new zzho();
        }
        if (i2 == 4) {
            return new zzhh(zze);
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
        synchronized (zzho.class) {
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

    public final List z() {
        return this.zzb;
    }

    private zzho() {
    }
}
