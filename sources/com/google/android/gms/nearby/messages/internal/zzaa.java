package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzaa extends com.google.android.gms.internal.nearby.zzb implements zzab {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        A();
        return true;
    }

    public zzaa() {
        super("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
    }
}
