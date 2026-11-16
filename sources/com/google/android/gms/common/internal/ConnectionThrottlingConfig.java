package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.libs.throttling.ThrottlingLimits;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "ConnectionThrottlingConfigCreator")
public class ConnectionThrottlingConfig extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ConnectionThrottlingConfig> CREATOR = new zzm();

    @SafeParcelable.Field(getter = "getLimitsMap", id = 1)
    private final SparseArray zza;

    @NonNull
    @KeepForSdk
    public SparseArray<ThrottlingLimits> getLimitsMap() {
        return this.zza.clone();
    }

    @Nullable
    public final ThrottlingLimits zza(int i) {
        SparseArray sparseArray = this.zza;
        return (ThrottlingLimits) sparseArray.get(i, (ThrottlingLimits) sparseArray.get(0));
    }

    @SafeParcelable.Constructor
    public ConnectionThrottlingConfig(@NonNull @SafeParcelable.Param(id = 1) SparseArray sparseArray) {
        SparseArray sparseArray2;
        if (sparseArray != null) {
            sparseArray2 = sparseArray.clone();
        } else {
            sparseArray2 = new SparseArray(0);
        }
        this.zza = sparseArray2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedSparseArray(parcel, 1, getLimitsMap(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
