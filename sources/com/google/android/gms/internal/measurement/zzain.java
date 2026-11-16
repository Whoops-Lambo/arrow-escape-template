package com.google.android.gms.internal.measurement;

import defpackage.i45;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzain implements zzaim {
    public static final i45 a;
    public static final i45 b;

    static {
        zzog zzogVar = zzagr.c;
        a = zzogVar.a("measurement.experiment.enable_passthrough_experiment_reporting", true);
        b = zzogVar.a("measurement.experiment.enable_phenotype_experiment_reporting", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzaim
    public final boolean zza() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaim
    public final boolean zzb() {
        return ((Boolean) b.get()).booleanValue();
    }
}
