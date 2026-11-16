package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzcu extends zzb implements zzcv {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1 || i == 2) {
            throw null;
        }
        if (i != 3) {
            return false;
        }
        parcel2.writeNoException();
        ClassLoader classLoader = zzc.a;
        parcel2.writeInt(1);
        return true;
    }

    public zzcu() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IDiagnosisKeyFileSupplier");
    }
}
