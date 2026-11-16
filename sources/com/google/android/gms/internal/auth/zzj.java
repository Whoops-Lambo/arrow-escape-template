package com.google.android.gms.internal.auth;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzj extends zzb implements zzk {
    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        Status status = (Status) zzc.a(parcel, Status.CREATOR);
        Bundle bundle = (Bundle) zzc.a(parcel, Bundle.CREATOR);
        zzc.b(parcel);
        J2(status, bundle);
        return true;
    }

    public zzj() {
        super("com.google.android.gms.auth.account.data.IBundleCallback");
    }
}
