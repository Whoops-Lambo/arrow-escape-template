package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbq extends zzbl implements zzbs {
    @Override // com.google.android.gms.internal.measurement.zzbs
    public final Bundle f(Bundle bundle) {
        Parcel parcelZ1 = z1();
        zzbn.b(parcelZ1, bundle);
        Parcel parcelR = r(1, parcelZ1);
        Bundle bundle2 = (Bundle) zzbn.a(parcelR, Bundle.CREATOR);
        parcelR.recycle();
        return bundle2;
    }
}
