package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ErrorCode[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = parcel.readInt();
        try {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (i == errorCode.a) {
                    return errorCode;
                }
            }
            throw new ErrorCode.UnsupportedErrorCodeException(i);
        } catch (ErrorCode.UnsupportedErrorCodeException e) {
            defpackage.d.n(e);
            return null;
        }
    }
}
