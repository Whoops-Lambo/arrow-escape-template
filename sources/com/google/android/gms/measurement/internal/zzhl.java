package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurementReceiver;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhl {
    public final AppMeasurementReceiver a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zza {
    }

    public zzhl(AppMeasurementReceiver appMeasurementReceiver) {
        Preconditions.checkNotNull(appMeasurementReceiver);
        this.a = appMeasurementReceiver;
    }
}
