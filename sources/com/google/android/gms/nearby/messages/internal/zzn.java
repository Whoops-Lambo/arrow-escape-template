package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import defpackage.y35;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzn extends com.google.android.gms.internal.nearby.zzb implements zzo {
    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            com.google.android.gms.internal.nearby.zzc.b(parcel);
            return true;
        }
        if (i == 2) {
            com.google.android.gms.internal.nearby.zzc.b(parcel);
            return true;
        }
        if (i != 4) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Update.CREATOR);
        com.google.android.gms.internal.nearby.zzc.b(parcel);
        new y35(arrayListCreateTypedArrayList);
        throw null;
    }

    public zzn() {
        super("com.google.android.gms.nearby.messages.internal.IMessageListener");
    }
}
