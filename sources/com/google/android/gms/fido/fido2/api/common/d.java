package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenBinding.TokenBindingStatus[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        try {
            for (TokenBinding.TokenBindingStatus tokenBindingStatus : TokenBinding.TokenBindingStatus.values()) {
                if (string.equals(tokenBindingStatus.a)) {
                    return tokenBindingStatus;
                }
            }
            throw new TokenBinding.UnsupportedTokenBindingStatusException(string);
        } catch (TokenBinding.UnsupportedTokenBindingStatusException e) {
            dr0.m(e);
            return null;
        }
    }
}
