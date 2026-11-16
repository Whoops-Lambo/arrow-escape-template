package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import defpackage.d45;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzx extends com.google.android.gms.internal.nearby.zzb implements zzy {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ClassLoader classLoader = com.google.android.gms.internal.nearby.zzc.a;
        parcel.readInt();
        com.google.android.gms.internal.nearby.zzc.b(parcel);
        new d45();
        throw null;
    }

    public zzx() {
        super("com.google.android.gms.nearby.messages.internal.IStatusCallback");
    }
}
