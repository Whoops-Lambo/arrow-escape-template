package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcx;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class te4 extends zzcx {
    public final AppMeasurementSdk.OnEventListener a;

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void L0(long j, Bundle bundle, String str, String str2) {
        this.a.a(j, bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final int zzf() {
        return System.identityHashCode(this.a);
    }

    public te4(AppMeasurementSdk.OnEventListener onEventListener) {
        this.a = onEventListener;
    }
}
