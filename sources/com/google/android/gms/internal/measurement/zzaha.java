package com.google.android.gms.internal.measurement;

import defpackage.i45;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzaha implements zzagz {
    public static final i45 a;
    public static final i45 b;

    static {
        zzog zzogVar = zzagr.c;
        a = zzogVar.a("measurement.set_default_event_parameters.fix_app_update_logging", true);
        b = zzogVar.a("measurement.set_default_event_parameters.fix_service_request_ordering", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzagz
    public final boolean zza() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagz
    public final boolean zzb() {
        return ((Boolean) b.get()).booleanValue();
    }
}
