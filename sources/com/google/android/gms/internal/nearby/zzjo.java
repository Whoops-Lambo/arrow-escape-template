package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzjo extends zzb implements zzjp {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            zzc.b(parcel);
            o1();
            return true;
        }
        if (i != 3) {
            return false;
        }
        zzc.b(parcel);
        return true;
    }

    public zzjo() {
        super("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
    }
}
