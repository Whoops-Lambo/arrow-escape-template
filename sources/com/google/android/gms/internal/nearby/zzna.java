package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "StopAllEndpointsParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzna extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzna> CREATOR = new zznb();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zzna);
    }

    public final int hashCode() {
        return 0;
    }

    @SafeParcelable.Constructor
    public zzna() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SafeParcelWriter.finishObjectHeader(parcel, SafeParcelWriter.beginObjectHeader(parcel));
    }
}
