package com.google.android.gms.internal.measurement;

import defpackage.k45;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzaie implements zzaid {
    public static final zzpo a = new zzpo(zzagr.c, 6);

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final long zzb() {
        return ((Long) a.b(1, -1L, "measurement.test.cached_long_flag").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final long zzd() {
        return ((Long) a.b(3, -2L, "measurement.test.int_flag").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final long zze() {
        return ((Long) a.b(4, -1L, "measurement.test.long_flag").get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final boolean zza() {
        return ((Boolean) a.a(0, "measurement.test.boolean_flag", false).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final double zzc() {
        zzpo zzpoVar = a;
        AtomicReferenceArray atomicReferenceArray = zzpoVar.a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(2);
        if (zzomVar == null) {
            k45 k45Var = new k45("measurement.test.double_flag", zzpoVar.b.a);
            while (!atomicReferenceArray.compareAndSet(2, null, k45Var)) {
                if (atomicReferenceArray.get(2) != null) {
                    zzomVar = (zzom) atomicReferenceArray.get(2);
                    zzomVar.getClass();
                }
            }
            zzomVar = k45Var;
        }
        return ((Double) zzomVar.get()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaid
    public final String zzf() {
        return (String) a.c(5, "measurement.test.string_flag", "---").get();
    }
}
