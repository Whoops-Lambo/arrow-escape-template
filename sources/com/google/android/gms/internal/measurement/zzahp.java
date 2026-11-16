package com.google.android.gms.internal.measurement;

import defpackage.i45;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzahp implements zzaho {
    public static final i45 a;
    public static final i45 b;
    public static final i45 c;

    static {
        zzog zzogVar = zzagr.c;
        a = zzogVar.a("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = zzogVar.a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = zzogVar.a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zzb() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zzc() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzaho
    public final boolean zzd() {
        return ((Boolean) c.get()).booleanValue();
    }
}
