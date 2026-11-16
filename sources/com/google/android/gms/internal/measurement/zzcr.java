package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzcr extends zzbm implements zzcs {
    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
        zzbn.d(parcel);
        ((zzcm) this).zzb(bundle);
        parcel2.writeNoException();
        return true;
    }

    public zzcr() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }
}
