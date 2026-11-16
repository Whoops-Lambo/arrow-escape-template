package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DeviceAuthDialog.RequestState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        DeviceAuthDialog.RequestState requestState = new DeviceAuthDialog.RequestState();
        requestState.a = parcel.readString();
        requestState.b = parcel.readString();
        requestState.c = parcel.readString();
        requestState.d = parcel.readLong();
        requestState.e = parcel.readLong();
        return requestState;
    }
}
