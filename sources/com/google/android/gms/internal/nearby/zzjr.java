package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzjr extends zzb implements zzjs {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            zzc.b(parcel);
            B();
            return true;
        }
        if (i == 3) {
            zzc.b(parcel);
            X0();
            return true;
        }
        if (i != 4) {
            return false;
        }
        zzc.b(parcel);
        return true;
    }

    public zzjr() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
    }
}
